package br.ifes.poo;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args){
		ImpostoRenda ir = new ImpostoRenda();
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		Double valor;
		int dependentes;
		
		System.out.print("Digite a receita Bruta: ");
		valor = leitor.nextDouble();
		
		System.out.print("Digite o numero de Dependentes: ");
		dependentes = leitor.nextInt();
		
		System.out.println("\nImposto a pagar: R$ "+ir.calcularImposto(valor,dependentes));
		
	}

}
