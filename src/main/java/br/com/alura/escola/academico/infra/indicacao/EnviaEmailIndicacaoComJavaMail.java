package br.com.alura.escola.academico.infra.indicacao;

import br.com.alura.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.academico.dominio.aluno.Aluno;

public class EnviaEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de emails com a lib javamail
	}

}
