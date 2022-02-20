package vetoresematrizes;

import java.util.Scanner;

public class vetorematriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
				//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
				//A seguir determine e imprima a média aritmética dos lançamentos, 
				//contabilize e apresente também quantas foram as ocorrências da maior pontuação.
				
				Scanner leia = new Scanner(System.in);
				
				int[]results = new int[10];
				double soma = 0.0, cont = 0.0, maior = 0.0, media = 0.0;

				System.out.println("--------------------------------\n");
				System.out.println("       LANÇAMENTO DE DADOS      \n");
				System.out.println("--------------------------------\n");

				for(int lado = 0; lado < 10; lado++){
					System.out.println("Digite o " + (lado + 1) + "º resultado dos lançamentos dos dados: ");
					results[lado] = leia.nextInt();
					soma = (soma + results[lado]);

					if(maior < results[lado]){
						maior = results[lado];
					}
					if(results[lado] == maior){
						cont++;
					}
				}
				media = soma / 10;
				
				System.out.println("\n" + "O maior número lançado foi o: " + maior);
				System.out.println("\n" + "O número acima apareceu " + cont + " vezes.");
				System.out.println("\n" + "A média aritmética dos resultados dos lançamentos foi: " + media);
				leia.close();

	}

}
