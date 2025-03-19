package desafio2;

import java.util.Scanner;

public class Geracao {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS
		int ano;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o ano de nascimento");
		ano = ler.nextInt();
		
		//PROCESSAMENTO E SAÍDA
		if (ano > 2010) {
			System.out.println("Geração Alpha");
		}
		else if (ano > 1996) {
			System.out.println("Geração Z");
		}
		else if (ano > 1980) {
			System.out.println("Geração Z/Millennials");
		}
		else if (ano > 1964) {
			System.out.println("Geração X");
		}
		else if (ano > 1945) {
			System.out.println("Geração Baby Boomers");
		}
		else {
			System.out.println("Geração indefinida");
		}
		ler.close();
	}

}
