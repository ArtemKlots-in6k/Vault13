package com.in6k.vault13.service;

import com.arangodb.ArangoException;
import com.in6k.vault13.dao.QuotesDao;
import com.in6k.vault13.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * Created by Artem Klots on 08.08.16.
 */
@Component
public class GalaxyNewsRadio {
    @Autowired
    QuotesDao quotesDao;

    public Quote getRandomQuote() throws ArangoException {
        Random randomGenerator = new Random();

        List<Quote> allQuotes = quotesDao.getAll();
        int randomQuoteNumber = randomGenerator.nextInt(allQuotes.size());

        return allQuotes.get(randomQuoteNumber);
    }

}
