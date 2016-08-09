package com.in6k.vault13.service;

import com.arangodb.ArangoException;
import com.in6k.vault13.dao.GalaxyNewsRadioDao;
import com.in6k.vault13.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bios on 08.08.16.
 */
@Component
public class GalaxyNewsRadioService {
    @Autowired
    GalaxyNewsRadioDao galaxyNewsRadioDao;

    public Quote getByKey(String key) throws ArangoException {
        return galaxyNewsRadioDao.getByKey(key);
    }

    public void insert(String author, String phrase) throws ArangoException {
        galaxyNewsRadioDao.insert(author, phrase);
    }
}
