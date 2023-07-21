package br.com.alura.escola.academico.dominio.aluno;

// Value Object
public class Email {

	private String endereco;

	public Email(String endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("Email é obrigatório.");
		}
		
		if (!endereco.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
			throw new IllegalArgumentException("Email inválido.");
		}
		
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
}
