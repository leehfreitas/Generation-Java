package vetoresematrizes;

import java.util.Scanner;

public class vetorematriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.	Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
				// Encontre ap�s a maior pontua��o e a apresente.
				
				Scanner leia = new Scanner(System.in);
				
				double[]leiturapont = new double[5]; double maiorpont = 0.0;
						
				for(int i = 0; i < leiturapont.length; i++){
					System.out.println("Insira a pontua��o da atividade: " + (i+1) + ": ");
					leiturapont[i] = leia.nextDouble();
					
					if(leiturapont[i] > maiorpont){
						maiorpont = leiturapont[i];
					}
				}
				System.out.println("\n" + "A maior pontua��o dentre as atividades �: " + maiorpont + "!" + "\n");
				leia.close();

	}

}
