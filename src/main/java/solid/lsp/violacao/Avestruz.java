package solid.lsp.violacao;

public class Avestruz extends Passaro {

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Avestruzes não podem voar!");
    }
}
