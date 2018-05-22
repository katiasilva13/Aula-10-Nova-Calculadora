package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.classe.Divisao;
import br.com.db1.start.classe.Multiplicacao;
import br.com.db1.start.classe.OperacaoMatematica;
import br.com.db1.start.classe.Soma;
import br.com.db1.start.classe.Subtracao;

public class OperadoresTest {

	@Test
	public void calcularTest() {
		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.calcular(30d,2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(12 == operacao.calcular(16d,4d));
		
		operacao = new Divisao();
		Assert.assertTrue(12 == operacao.calcular(24d,2d));
		
		operacao = new Multiplicacao();
		Assert.assertTrue(12 == operacao.calcular(2d,6d));
	}

}
