package solid.dip;

import solid.dip.respeito.model.DB;
import solid.dip.respeito.payment.PaymentRespeito;
import solid.dip.violacao.payment.Payment;

/*
 * O princípio da Inversão de Depedência (Dependency Inversion Principle - DIP) estabelece que:
 *      1- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem
 *      depender de abstrações;
 *      2- Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
 *
 * Um módulo de alto nível seria um módulo de regra de negócio. São os módulos que definem o que
 * sua aplicação deve fazer.
 * Já um módulo de baixo nível seriam os módulos que definem como sua aplicação deve fazer o que
 * está estabelecido nos módulos de alto nível.
 */
public class Main {

    public static void main(String[] args) {
        //Exemplo que viola
        Payment payment = new Payment();
        payment.pay("350");

        //Exemplo que respeita
        PaymentRespeito paymentRespeito = new PaymentRespeito();
        paymentRespeito.pay("350", DB.POSTGRESQL);
    }
}
