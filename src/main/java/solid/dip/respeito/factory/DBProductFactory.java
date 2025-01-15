package solid.dip.respeito.factory;

import solid.dip.respeito.model.*;

public class DBProductFactory {
    public static IDBProduct create(DB type) {
        switch (type) {
            case MYSQL -> {
                return new MySQLDBProduct();
            }
            case MONGODB -> {
                return new MongoDBProduct();
            }
            case POSTGRESQL -> {
                return new PostgreSQLDBProduct();
            }
            default -> {
                return null;
            }
        }
    }
}
