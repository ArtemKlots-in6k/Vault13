package com.in6k.vault13.controller;

import com.arangodb.ArangoException;
import com.in6k.vault13.entity.Quote;
import com.in6k.vault13.service.GalaxyNewsRadio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Artem Klots on 08.08.16.
 */
@RestController
public class GalaxyNewsRadioController {
    @Autowired
    GalaxyNewsRadio galaxyNewsRadioService;

    @RequestMapping("/")
    public String index() throws ArangoException {
        Quote quote = galaxyNewsRadioService.getRandomQuote();

        return quote.getAuthor() + ": " + quote.getPhrase();
    }
}
