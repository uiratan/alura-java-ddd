package br.com.alura.escola.dominio.aluno;

public class CadastroAlunoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CadastroAlunoException(String msg) {
		super(msg);
	}
}
