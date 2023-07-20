package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// mock - mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		MatricularAlunoDto dados = new MatricularAlunoDto("Uiratan", "649.159.563-34", "uiratan@gmail.com");
		useCase.executa(dados);		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("649.159.563-34"));
		
		assertEquals("Uiratan", encontrado.getNome());
		assertEquals("649.159.563-34", encontrado.getCpf());
		assertEquals("uiratan@gmail.com", encontrado.getEmail());
	}

}
