package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}

