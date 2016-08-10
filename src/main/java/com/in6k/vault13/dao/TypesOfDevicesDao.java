package com.in6k.vault13.dao;

import com.arangodb.ArangoException;
import com.arangodb.DocumentCursor;
import com.arangodb.entity.DocumentEntity;
import com.in6k.vault13.databaseConnector.DatabaseConnector;
import com.in6k.vault13.entity.TypeOfDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by employee on 8/10/16.
 */
@Component
public class TypesOfDevicesDao {
    @Autowired
    DatabaseConnector databaseConnector;

    public List<TypeOfDevice> getAll() throws ArangoException {
        List<TypeOfDevice> allTypes = new ArrayList<>();

        String query = "FOR types IN typesOfDevices RETURN types";
        Map<String, Object> bindVars = new HashMap<>();
        DocumentCursor<TypeOfDevice> documentCursor = databaseConnector.getArangoDriver().executeDocumentQuery(
                query, bindVars, databaseConnector.getArangoDriver().getDefaultAqlQueryOptions(), TypeOfDevice.class);

        for (DocumentEntity<TypeOfDevice> documentEntity : documentCursor.asList()) {
            allTypes.add(new TypeOfDevice(
                    Integer.parseInt(documentEntity.getDocumentKey()),
                    documentEntity.getEntity().getTitle()
            ));
        }
        return allTypes;
    }
}
