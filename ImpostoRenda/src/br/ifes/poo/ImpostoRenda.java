package br.ifes.poo;

import br.ifes.poo.taxa.Aliquota;
import br.ifes.poo.taxa.PrimeiraFaixa;
import br.ifes.poo.taxa.QuartaFaixa;
import br.ifes.poo.taxa.QuintaFaixa;
import br.ifes.poo.taxa.SegundaFaixa;
import br.ifes.poo.taxa.TerceiraFaixa;

public class ImpostoRenda {
	
	private Double valor;
	private Aliquota taxa;
	
	public void informarValor(Double v){
		
		valor = v;
		if(valor < 1710.78) taxa = new PrimeiraFaixa(0.0);
		else if (valor < 2563.91) taxa = new SegundaFaixa(7.5);
		else if (valor < 3418.59) taxa = new TerceiraFaixa(15.0);
		else if (valor < 4271.59) taxa = new QuartaFaixa(22.5);
		else taxa = new QuintaFaixa(27.5);
	}
	
	public Double calcularImposto(){
		return taxa.calcularValor(valor);
	}

}
