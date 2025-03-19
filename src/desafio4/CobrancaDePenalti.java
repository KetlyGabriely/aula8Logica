package desafio4;

import java.util.Random;
import java.util.Scanner;

public class CobrancaDePenalti {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS
		int escolhaJogador;
		int escolhaGoleiro;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Escolha onde chutar do gol (1 para esquerda, 2 para o meio e 3 para direita): ");
		escolhaJogador = ler.nextInt();
		
		escolhaGoleiro = random.nextInt(3) + 1;
		
		
		if (escolhaJogador == escolhaGoleiro) {
			System.out.println("Penâlti defendido!");
		}
		else {
			System.out.println("GOOL!");
		}
		ler.close();
		
	}

}
