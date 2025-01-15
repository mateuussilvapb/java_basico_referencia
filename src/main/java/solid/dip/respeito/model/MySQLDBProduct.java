package solid.dip.respeito.model;

public class MySQLDBProduct implements IDBProduct {
    @Override
    public String getProductById(String productID) {
        return "Mysql: Exibindo dados do Produto " + productID;
    }
}
