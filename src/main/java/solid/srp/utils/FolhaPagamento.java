package solid.srp.utils;

import solid.srp.dao.FuncionarioDAO;

/*
    A classe 'main' possui uma classe de exemplo que viola o SRP.
    A classe Funcionario, presente na classe Main, possui 3 métodos que realizam ações diferentes.
    Ela viola o SRP porque possui mais de uma responsabilidade. Para que o SRP seja respeitado, cada método
    deve ser separado em uma classe diferente. As classes criadas, no entanto, podem possuir mais
    de um método, contanto que todos os métodos presentes na classe criada sejam coerentes com o
    objetivo da classe.
 */
public class FolhaPagamento {

    public void calcularSalario(FuncionarioDAO funcionario) {
        // Calcula o salário do funcionário
    }

    public void calcularDecimoTerceiro(FuncionarioDAO funcionario) {
        // Calcula o décimo terceiro do funcionário
    }
}
