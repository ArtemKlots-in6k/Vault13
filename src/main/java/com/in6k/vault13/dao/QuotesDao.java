package com.in6k.vault13.dao;

import com.arangodb.ArangoException;
import com.arangodb.DocumentCursor;
import com.arangodb.entity.DocumentEntity;
import com.in6k.vault13.databaseConnector.DatabaseConnector;
import com.in6k.vault13.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem Klots on 08.08.16.
 */
@Component
public class QuotesDao {
    @Autowired
    DatabaseConnector databaseConnector;

    public List<Quote> getAll() throws ArangoException {
        List<Quote> allQuotes = new ArrayList<>();

        String query = "FOR p IN phrases RETURN p";
        Map<String, Object> bindVars = new HashMap<String, Object>();
        DocumentCursor<Quote> documentCursor = databaseConnector.getArangoDriver().executeDocumentQuery(
                query, bindVars, databaseConnector.getArangoDriver().getDefaultAqlQueryOptions(), Quote.class);

        for (DocumentEntity<Quote> documentEntity : documentCursor.asList()) {
            allQuotes.add(documentEntity.getEntity());
        }

        return allQuotes;
    }

}
