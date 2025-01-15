package solid.dip.respeito.model;

public class MongoDBProduct implements IDBProduct {
    @Override
    public String getProductById(String productID) {
        return "Mongodb: Exibindo dados do Produto " + productID;
    }
}
