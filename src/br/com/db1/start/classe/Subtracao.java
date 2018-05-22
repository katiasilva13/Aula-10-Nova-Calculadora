package br.com.db1.start.classe;

public class Subtracao implements OperacaoMatematica {

	@Override
	public Double calcular(Double valor1, Double valor2) {
		return valor1 - valor2;
	} 
}
