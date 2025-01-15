package solid.dip.violacao.payment;

import solid.dip.violacao.model.MySQLDBProduct;

/*
 * Atualmente, o método 'pay' depende diretamente da classe 'MySQLDBProduct', que é uma implementação
 * concreta (módulo de baixo nível) do acesso ao banco de dados.
 *
 * O módulo 'payment' representa um módulo de alto nível, mas está violando o Princípio da Inversão
 * de Dependência, pois depende de uma implementação específica em vez de uma abstração.
 *
 * Para seguir o DIP, tanto o módulo de alto nível ('PaymentRespeito') quanto o módulo de baixo nível
 * ('MySQLDBProduct') deveriam depender de uma abstração comum.
 */

public class Payment {
    public void pay(String productID) {
        MySQLDBProduct dbProduct = new MySQLDBProduct();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
