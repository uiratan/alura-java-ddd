package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF("15958"));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF("CPF Invalido"));
	}
	
	@Test
	void deveriaCriarCPFComNumeroValido() {
		CPF cpf = new CPF("64915956334");		
		CPF cpf2 = new CPF("649.159.563-34");
		
		assertEquals(cpf.getNumero(), "64915956334");
		assertEquals(cpf2.getNumero(), "649.159.563-34");
	}

}
