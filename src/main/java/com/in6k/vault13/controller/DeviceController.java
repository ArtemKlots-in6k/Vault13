package com.in6k.vault13.controller;

import com.arangodb.ArangoException;
import com.in6k.vault13.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Artem Klots on 8/10/16.
 */
@RestController
public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @RequestMapping("/api/devices")
    public String index() throws ArangoException {

        return String.valueOf(deviceService.getAll());
    }
}
