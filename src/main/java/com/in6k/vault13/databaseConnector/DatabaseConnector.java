package com.in6k.vault13.databaseConnector;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoDriver;
import org.springframework.stereotype.Component;

/**
 * Created by employee on 8/8/16.
 */
@Component
public class DatabaseConnector {
    private ArangoDriver arangoDriver;

    public DatabaseConnector() {
        ArangoConfigure configure = new ArangoConfigure();
        configure.loadProperties();
        configure.init();
        arangoDriver = new ArangoDriver(configure);
    }

    public ArangoDriver getArangoDriver() {
        return arangoDriver;
    }

    public void setArangoDriver(ArangoDriver arangoDriver) {
        this.arangoDriver = arangoDriver;
    }
}
