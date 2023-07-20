package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDOuNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone(null, null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("", null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("dddinvalido", null));
		
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("86", null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("86", ""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("86", "dddinvalido"));
		
	}

	@Test
	public void deveriaCriarTelefoneComInformacoesCorretas() {
		Telefone telefone = new Telefone("86", "981921010");	
		assertEquals(telefone.getDdd(), "86");
		assertEquals(telefone.getNumero(), "981921010");
		
		Telefone telefone2 = new Telefone("86", "32222222");	
		assertEquals(telefone2.getDdd(), "86");
		assertEquals(telefone2.getNumero(), "32222222");
	}

}
