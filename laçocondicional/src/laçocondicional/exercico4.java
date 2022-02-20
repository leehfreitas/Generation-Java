package laçocondicional;

import java.util.Scanner;

public class exercico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
				//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

				Scanner leia = new Scanner(System.in);
				
				int num, raiz, pot;
			
				System.out.println("Escreva um número qualquer: ");
				num = leia.nextInt();
			
				if(num % 2 == 0) {
					raiz = (int) Math.sqrt(num);
				System.out.println("\n" + "Este número é par, e sua raíz quadrada é: " + raiz);
				
				}
				if(num % 2 != 0) {
					pot = (int) Math.pow(num, 2.0);
				System.out.println("\n" + "Este numéro é ímpar: " + num + ", e ele elevado ao quadrado(²) é: " + pot);
				
				}
				leia.close();

	}

}
