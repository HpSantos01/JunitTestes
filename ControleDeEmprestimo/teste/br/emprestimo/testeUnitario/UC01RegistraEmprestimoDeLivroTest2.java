package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;

public class UC01RegistraEmprestimoDeLivroTest2 {
	
	@Test
	public void CT10QuandoAdatadeEmprestimoForValidaErro() {
		//cenario
		String data = "20/05/2018";
		Emprestimo umEmprestimo = new Emprestimo();
		
		//acao 
		boolean resultadoObtido = umEmprestimo.validaData(data);
		
		//verificacao
		assertTrue(resultadoObtido);
		
	}
	
}
