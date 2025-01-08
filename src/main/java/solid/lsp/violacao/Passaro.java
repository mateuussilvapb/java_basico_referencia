package solid.lsp.violacao;

/*
 * Essa classe é a classe base. Por si só, ela não viola o princípio da substituição de Liskov.
 */
public class Passaro {
    public void voar() {
        System.out.println("Este pássaro pode voar!");
    }
}
