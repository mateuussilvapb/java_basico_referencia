package solid.dip.respeito.payment;

import solid.dip.respeito.factory.DBProductFactory;
import solid.dip.respeito.model.DB;
import solid.dip.respeito.model.IDBProduct;

public class PaymentRespeito {
    public void pay(String productID, DB type) {
        IDBProduct dbProduct = DBProductFactory.create(type);
        assert dbProduct != null;
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
