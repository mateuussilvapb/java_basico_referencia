package solid.lsp;

import solid.lsp.respeito.Pardal;
import solid.lsp.respeito.PassaroQueVoa;
import solid.lsp.violacao.Avestruz;
import solid.lsp.violacao.Passaro;

public class Main {
    /*
     * O princípio da substituição de Liskov diz que uma subclasse
     * deve ser capaz de substituir a sua superclasse, sem causar nenhum
     * problema na execução do código
     */
    public static void main(String[] args) {

        /*
         * No exemplo, ao substituir a superclasse pela subclasse Avestruz, a execução irá
         * lançar um erro, pois avestruzes não voam.
         */
        ObservadorDePassarosViolacao observadorViolacao = new ObservadorDePassarosViolacao();
        Passaro avestruz = new Avestruz();
        observadorViolacao.observarPassaroVoar(avestruz);

        /*
         * O exemplo abaixo utiliza implementações que respeitam o princípio da substituição de
         * Liskov.
         */
        ObservadorDePassarosRespeito observadorRespeito = new ObservadorDePassarosRespeito();
        PassaroQueVoa pardal = new Pardal();
        observadorRespeito.observarPassaroVoar(pardal);
    }

}

class ObservadorDePassarosViolacao {
    public void observarPassaroVoar(Passaro passaro) {
        passaro.voar();
    }
}

class ObservadorDePassarosRespeito {
    public void observarPassaroVoar(PassaroQueVoa passaro) {
        passaro.fly();
    }
}
