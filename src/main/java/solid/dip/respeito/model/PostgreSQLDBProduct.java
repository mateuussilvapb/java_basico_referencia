package solid.dip.respeito.model;

public class PostgreSQLDBProduct implements IDBProduct {
    @Override
    public String getProductById(String productID) {
        return "Postgresql: Exibindo dados do Produto " + productID;
    }
}
