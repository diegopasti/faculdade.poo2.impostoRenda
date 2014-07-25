package br.ifes.poo.taxa;

public class FaixaAbstrata implements Aliquota{

	private Double taxa;
	
	@Override
	public Double calcularValor(Double v) {
		return v*(taxa/100);
	}

	
	
}
