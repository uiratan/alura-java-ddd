package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.dominio.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.CPF;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// mock - mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio, new PublicadorDeEventos());
		MatricularAlunoDto dados = new MatricularAlunoDto("Uiratan", "649.159.563-34", "uiratan@gmail.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("649.159.563-34"));
		
		assertEquals("Uiratan", encontrado.getNome());
		assertEquals(new CPF("649.159.563-34"), encontrado.getCpf());
		assertEquals("uiratan@gmail.com", encontrado.getEmail());
	}

}
