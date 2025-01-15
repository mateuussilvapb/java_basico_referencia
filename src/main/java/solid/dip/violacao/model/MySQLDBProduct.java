package solid.dip.violacao.model;

public class MySQLDBProduct {
    public String getProductById(String productID) {
        return "Mysql: Exibindo dados do Produto " + productID;
    }
}
