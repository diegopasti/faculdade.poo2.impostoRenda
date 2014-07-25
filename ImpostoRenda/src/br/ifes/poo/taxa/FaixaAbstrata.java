package br.ifes.poo.taxa;

public class FaixaAbstrata implements Aliquota{

	protected Double taxa;
	
	public FaixaAbstrata(Double valor){
		taxa = valor;
	}
	
	@Override
	public Double calcularValor(Double v) {
		return v*(taxa/100);
	}

	
	
}
