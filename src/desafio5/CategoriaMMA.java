package desafio5;

import java.util.Scanner;

public class CategoriaMMA {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS
		String sexo;
		double peso;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o seu sexo (M ou F): ");
		sexo = ler.next();
		System.out.println("Informe seu peso em kg: ");
		peso = ler.nextDouble();
		
		//PROCESSAMENTO E SAÍDA
		if (sexo == "M");
		else if (peso > 93.0) {
			System.out.println("Peso pesado");
		}
		else if (peso >= 84.0) {
			System.out.println("Peso meio-pesado");
		}
		else if (peso >= 77.2) {
			System.out.println("Peso médio");
		}
		else if (peso >= 70.4) {
			System.out.println("Peso meio-médio");
		}
		else if (peso >= 65.9) {
			System.out.println("Peso leve");
		}
		else if (peso >= 61.3) {
			System.out.println("Peso pena");
		}
		else if (peso >= 56.8) {
			System.out.println("Peso galo");
		}
		else {
			System.out.println("Peso Mosca");
		}
		
		if (sexo == "F");
		else if (peso > 61.2) {
			System.out.println("Peso pena");
		}
		else if (peso >= 56.8) {
			System.out.println("Peso galo");
		}
		else if (peso >= 52.3) {
			System.out.println("Peso mosca");
		}
		else {
			System.out.println("Peso palha");
		}
		
		ler.close();
			
	}

}
