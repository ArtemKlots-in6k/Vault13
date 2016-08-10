package com.in6k.vault13.service;

import com.arangodb.ArangoException;
import com.in6k.vault13.dao.DevicesDao;
import com.in6k.vault13.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Artem Klots on 8/10/16.
 */
@Component
public class DeviceService {
    @Autowired
    DevicesDao devicesDao;

    public List<Device> getAll() throws ArangoException {
        return devicesDao.getAll();
    }
}
