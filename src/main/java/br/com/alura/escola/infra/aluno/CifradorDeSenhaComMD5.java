package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		return "senha";
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return true;
	}

}
