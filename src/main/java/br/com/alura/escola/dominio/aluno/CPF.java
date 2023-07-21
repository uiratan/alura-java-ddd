package br.com.alura.escola.dominio.aluno;

public class CPF {
	private String numero;

	public CPF(String cpf) {
		if (cpf == null) {
			throw new IllegalArgumentException("CPF é obrigatório.");
		}
		
		if (!cpf.matches("^([0-9]{3}\\.?){3}-?[0-9]{2}$")) {
			throw new IllegalArgumentException("CPF inválido.");
		}
		
		this.numero = cpf;
	}
	
	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return numero;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CPF other = (CPF) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
}