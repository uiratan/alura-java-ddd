package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	
	private Aluno aluno;
	
	@BeforeEach
	void beforeEach() {
		CPF cpf = new CPF("64915956334");
		Email email = new Email("uiratan@gmail.com");
		this.aluno = new Aluno(cpf, "Uiratan Cavalcante", email);	
	}

	@Test
	public void deverirPermitirAdicionarTelefone() {
		aluno.adicionarTelefone("86", "981921010");
		assertEquals(1, aluno.getTelefones().size());
	}
	
	@Test
	public void deverirPermitirAdicionar2Telefones() {
		aluno.adicionarTelefone("86", "981921010");
		aluno.adicionarTelefone("86", "32222222");
		assertEquals(2, aluno.getTelefones().size());
	}
	
	@Test
	public void naoDeverirPermitirAdicionar3Telefones() {
		aluno.adicionarTelefone("86", "981921010");			
		aluno.adicionarTelefone("86", "32222222");

		assertThrows(CadastroAlunoException.class, 
				() -> aluno.adicionarTelefone("86", "365215987"));
	}

}
