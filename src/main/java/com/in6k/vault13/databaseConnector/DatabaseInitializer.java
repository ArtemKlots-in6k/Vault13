package com.in6k.vault13.databaseConnector;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoDriver;
import com.arangodb.ArangoException;
import com.arangodb.entity.BaseDocument;
import com.in6k.vault13.entity.Quote;

import java.util.*;

/**
 * Created by Artem Klots on 8/8/16.
 */
public class DatabaseInitializer {
    public static void main(String[] args) throws ArangoException {
        ArangoConfigure configure = new ArangoConfigure();
        configure.loadProperties();
        configure.init();
        ArangoDriver arangoDriver = new ArangoDriver(configure);

        List<Quote> phrases = new ArrayList<>();
        phrases.add(new Quote("Marcus", "Been there. Seen that. Got the scars."));
        phrases.add(new Quote("Cassidy", "Dad named me after some comic book character from before the war. Said he was a mean sonuvabitch, too."));
        phrases.add(new Quote("Myron", "Kee-rist. That has got to be the dumbest... hmmmm..."));
        phrases.add(new Quote("Sulik", "Grampy-bone be doing da killin' right now."));
        phrases.add(new Quote("Mason", "Well, check out this bouquet of assholes."));
        phrases.add(new Quote("Drill-Sergeant", "Welcome to the camp Navarro, so you are the new replacement. You are out of uniform soldier, where is your power armor!?."));


        for (Quote quote : phrases) {
            BaseDocument quoteToAdd = new BaseDocument();
            quoteToAdd.addAttribute("author", quote.getAuthor());
            quoteToAdd.addAttribute("phrase", quote.getPhrase());

            arangoDriver.createDocument("phrases", quote);
        }
    }
}
