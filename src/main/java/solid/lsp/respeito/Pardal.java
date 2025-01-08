package solid.lsp.respeito;

public class Pardal implements PassaroQueVoa {
    @Override
    public void fly() {
        System.out.println("O pardal pode voar!");
    }

    @Override
    public void comer() {
        System.out.println("O pardal está comendo...");
    }
}
