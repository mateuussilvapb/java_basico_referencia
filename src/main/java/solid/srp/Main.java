package solid.srp;

public class Main {
    /*
        O Single Responsibility Principle (SRP) é um dos princípios mais fundamentais do design de software orientado a objetos. A sua definição básica é:
            - Uma classe deve ter apenas um motivo para mudar, ou seja, deve ter apenas uma
            responsabilidade bem definida.
     */
    public static void main(String[] args) {
    }

    //Exemplo de classe que viola o SRP
    public class Funcionario {
        private String nome;
        private String cargo;
        private double salario;

        public void salvar() {
            // Salva o funcionário no banco de dados
        }

        public void calcularSalario() {
            // Calcula o salário do funcionário
        }

        public void imprimirContraCheque() {
            // Imprime o contracheque do funcionário
        }
    }

}
