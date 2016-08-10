package com.in6k.vault13.controller;

import com.arangodb.ArangoException;
import com.in6k.vault13.entity.Device;
import com.in6k.vault13.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Artem Klots on 8/10/16.
 */
@RestController
public class DeviceController {
    @Autowired
    DeviceService deviceService;

    @RequestMapping("/api/devices")
    public List<Device> index() throws ArangoException {
        return deviceService.getAll();
    }
}
