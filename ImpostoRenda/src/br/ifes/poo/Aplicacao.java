package br.ifes.poo;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		ImpostoRenda ir = new ImpostoRenda();
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a receita Bruta: ");
		ir.informarValor(leitor.nextDouble());
		System.out.println("\nImposto a pagar: R$ "+ir.calcularImposto());
		
	}

}
