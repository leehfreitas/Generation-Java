package vetoresematrizes;

import java.util.Scanner;

public class vetorematriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3
				//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.

				Scanner leia = new Scanner(System.in);	
				
				double[][] matriz = new double[3][3];
				double soma = 0; double sdiagonal = 0;

				for(int l = 0; l < 3; l++){
					for(int c = 0; c < 3; c++){
						System.out.print("Digite um valor para preencher a matriz: ");
						matriz[l][c] = leia.nextDouble();

						soma += matriz[l][c];
					}
				}
				for(int l = 0; l < 3; l++){
					//para(inteiro c = 0; c < 3; c++){
						//se(l == c){
							sdiagonal += matriz[l][l];
						//}6
					//}
				}
				System.out.print("\n");
				System.out.println("A Soma dos valores da matriz é: " + soma);
				System.out.println("A Soma da diagonal principal é: " + sdiagonal);
				leia.close();

	}

}
