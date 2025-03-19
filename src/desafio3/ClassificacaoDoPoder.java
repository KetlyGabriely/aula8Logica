package desafio3;

import java.util.Scanner;

public class ClassificacaoDoPoder {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS
		int pontuacao;
		String personagem;
		
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do personagem: ");
		personagem = ler.next();
		
		System.out.println("Informe a sua pontuação de força (de 1 a 100): ");
		pontuacao = ler.nextInt();
		
		//PROCESSAMENTO E SAÍDA
		if (pontuacao > 80 && pontuacao < 101) {
			System.out.println("Lendário");
		}
		else if (pontuacao > 50 && pontuacao < 101) {
			System.out.println("Elite");
		}
		else if (pontuacao > 20 && pontuacao < 101) {
			System.out.println("Guerreiro");
		}
		else if (pontuacao > 0 && pontuacao < 101) {
			System.out.println("Inciante");
		}
		else {
			System.out.println("Erro");
		}
		ler.close();
		
	}

}
