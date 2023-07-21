package br.com.alura.escola.academico.dominio.aluno;

public class Telefone {
	
	private String ddd; // 2 digitos
	private String numero; // 8 ou 9 digitos
	
	public Telefone(String ddd, String numero) {
		if (ddd == null || numero == null) {
			throw new IllegalArgumentException("DDD e número são obrigatórios.");
		}
		
		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD inválido.");
		}

		if (!numero.matches("\\d{8,9}")) {
			throw new IllegalArgumentException("Número inválido.");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
	
	

}
