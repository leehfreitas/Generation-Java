package vetoresematrizes;

import java.util.Scanner;

public class vetorematriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
				//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
				//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
				//contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
				
				Scanner leia = new Scanner(System.in);
				
				int[]results = new int[10];
				double soma = 0.0, cont = 0.0, maior = 0.0, media = 0.0;

				System.out.println("--------------------------------\n");
				System.out.println("       LAN�AMENTO DE DADOS      \n");
				System.out.println("--------------------------------\n");

				for(int lado = 0; lado < 10; lado++){
					System.out.println("Digite o " + (lado + 1) + "� resultado dos lan�amentos dos dados: ");
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
				
				System.out.println("\n" + "O maior n�mero lan�ado foi o: " + maior);
				System.out.println("\n" + "O n�mero acima apareceu " + cont + " vezes.");
				System.out.println("\n" + "A m�dia aritm�tica dos resultados dos lan�amentos foi: " + media);
				leia.close();

	}

}
