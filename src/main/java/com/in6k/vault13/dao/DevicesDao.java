package com.in6k.vault13.dao;

import com.arangodb.ArangoException;
import com.arangodb.DocumentCursor;
import com.arangodb.entity.DocumentEntity;
import com.in6k.vault13.databaseConnector.DatabaseConnector;
import com.in6k.vault13.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem Klots on 8/10/16.
 */
@Component
public class DevicesDao {
    @Autowired
    DatabaseConnector databaseConnector;

    public List<Device> getAll() throws ArangoException {
        List<Device> allDevices = new ArrayList<>();

        String query = "FOR device IN devices RETURN device";
        Map<String, Object> bindVars = new HashMap<>();
        DocumentCursor<Device> documentCursor = databaseConnector.getArangoDriver().executeDocumentQuery(
                query, bindVars, databaseConnector.getArangoDriver().getDefaultAqlQueryOptions(), Device.class);

        for (DocumentEntity<Device> documentEntity : documentCursor.asList()) {
            allDevices.add(new Device(
                    Integer.parseInt(documentEntity.getDocumentKey()),
                    documentEntity.getEntity()
            ));
        }
        return allDevices;
    }

}
