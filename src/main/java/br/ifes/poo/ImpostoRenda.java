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
	private Double tributo;
	
	private Aliquota calcularTaxa(Double v){
		Aliquota faixa;
		valor = v;
		if(valor < 1710.78) faixa = new PrimeiraFaixa(0.0);
		else if (valor < 2563.91) faixa = new SegundaFaixa(7.5);
		else if (valor < 3418.59) faixa = new TerceiraFaixa(15.0);
		else if (valor < 4271.59) faixa = new QuartaFaixa(22.5);
		else faixa = new QuintaFaixa(27.5);
		return faixa;
	}
	
	private Double deducaoImposto(int numDependentes){
		return numDependentes*315.0;
	}
	
	public Double calcularImposto(Double v, int d){
		taxa = calcularTaxa(v);
		tributo = taxa.calcularValor(valor);
		
		if(tributo > 0.0){
			tributo = tributo-deducaoImposto(d);
		}
		return tributo;
	}

}
