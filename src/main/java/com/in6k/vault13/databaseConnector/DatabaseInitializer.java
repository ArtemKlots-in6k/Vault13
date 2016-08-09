package com.in6k.vault13.databaseConnector;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoDriver;
import com.arangodb.ArangoException;
import com.arangodb.entity.BaseDocument;
import com.in6k.vault13.dao.GalaxyNewsRadioDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by employee on 8/8/16.
 */
public class DatabaseInitializer {
    public static void main(String[] args) throws ArangoException {
        ArangoConfigure configure = new ArangoConfigure();
        configure.loadProperties();
        configure.init();
        ArangoDriver arangoDriver = new ArangoDriver(configure);

        Map<String, String> phrases = new LinkedHashMap();
        phrases.put("Marcus", "Been there. Seen that. Got the scars.");
        phrases.put("Cassidy", "Dad named me after some comic book character from before the war. Said he was a mean sonuvabitch, too.");
        phrases.put("Myron", "Kee-rist. That has got to be the dumbest... hmmmm...");
        phrases.put("Sulik", "Grampy-bone be doing da killin' right now.");
        phrases.put("Mason", "Well, check out this bouquet of assholes.");
        phrases.put("Drill-Sergeant", "Welcome to the camp Navarro, so you are the new replacement. You are out of uniform soldier, where is your power armor!?.");


        for (Map.Entry<String, String> entry : phrases.entrySet()) {
            BaseDocument quote = new BaseDocument();
            quote.setDocumentKey(entry.getKey());
            quote.addAttribute("phrase", entry.getValue());

            arangoDriver.createDocument("phrases", quote);

        }
    }
}
