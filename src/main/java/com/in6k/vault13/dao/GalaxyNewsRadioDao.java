package com.in6k.vault13.dao;

import com.arangodb.ArangoException;
import com.arangodb.CursorResultSet;
import com.arangodb.entity.BaseDocument;
import com.arangodb.entity.DocumentEntity;
import com.in6k.vault13.databaseConnector.DatabaseConnector;
import com.in6k.vault13.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bios on 08.08.16.
 */
@Component
public class GalaxyNewsRadioDao {
    @Autowired
    DatabaseConnector databaseConnector;

    public Quote getByKey(String key) throws ArangoException {
        DocumentEntity<BaseDocument> documentQuote =
                databaseConnector.getArangoDriver().getDocument("phrases", key, BaseDocument.class);
        BaseDocument quote = documentQuote.getEntity();

        return new Quote(quote.getDocumentKey(), quote.getProperties().get("phrase").toString());
    }

    public void insert(String author, String phrase) throws ArangoException {
        BaseDocument quote = new BaseDocument();
        quote.setDocumentKey(author);
        quote.addAttribute("phrase", phrase);

        databaseConnector.getArangoDriver().createDocument("phrases", quote);
    }
}
