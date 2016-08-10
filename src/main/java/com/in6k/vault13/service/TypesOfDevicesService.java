package com.in6k.vault13.service;

import com.arangodb.ArangoException;
import com.in6k.vault13.dao.TypesOfDevicesDao;
import com.in6k.vault13.entity.TypeOfDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by employee on 8/10/16.
 */
@Component
public class TypesOfDevicesService {
    @Autowired
    TypesOfDevicesDao typesOfDevicesDao;

    public List<TypeOfDevice> getAll() throws ArangoException {
        return typesOfDevicesDao.getAll();
    }
}
