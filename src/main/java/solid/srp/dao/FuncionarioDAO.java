package solid.srp.dao;

import solid.srp.model.FuncionarioSRP;

/*
    A classe main possui uma classe de exemplo que viola o SRP.
    A classe Funcionario, presente na classe Main, possui 3 métodos que realizam ações diferentes.
    Ela viola o SRP porque possui mais de uma responsabilidade. Para que o SRP seja respeitado, cada método
    deve ser separado em uma classe diferente. As classes criadas, no entanto, podem possuir mais
    de um método, contanto que todos os métodos presentes na classe criada sejam coerentes com o
    objetivo da classe.
 */
public class FuncionarioDAO {
    public void salvar(FuncionarioSRP funcionario) {
        // Salva o funcionário no banco de dados
    }

    public void atualizar(FuncionarioSRP funcionario) {
        // Atualiza o funcionário no banco de dados
    }

    public void deletar(FuncionarioSRP funcionario) {
        // Deleta o funcionário no banco de dados
    }

    public void buscar(FuncionarioSRP funcionario) {
        // Busca o funcionário no banco de dados
    }
}
