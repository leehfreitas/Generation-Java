package la�ocondicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2-	Fa�a um programa que entre com tr�s n�meros e
				// coloque em ordem crescente.
				
				Scanner leia = new Scanner(System.in);
				
				int primeiroN, segundoN, terceiroN;
				
				System.out.println("Entre com o 1� n�mero: ");
				primeiroN = leia.nextInt();
				
				System.out.println("Entre com o 2� n�mero: ");
				segundoN = leia.nextInt();
				
				System.out.println("Entre com o 3� n�mero: ");
				terceiroN = leia.nextInt();
				
				if(primeiroN < segundoN) {
					if(segundoN < terceiroN) {
						System.out.println("A ordem crescente dos n�mero � : " + primeiroN + " " + segundoN + " " + terceiroN);
					}
					else if(primeiroN < terceiroN) {
						System.out.println("A ordem crescente dos n�meros �: " + primeiroN + " " + terceiroN + " " + segundoN);				
					}
					else {
						System.out.println("A ordem crescente dos n�meros �: " + terceiroN + " " + primeiroN + " " + segundoN);
					}		
				}		
				else if(segundoN < terceiroN) {
					if(primeiroN < terceiroN) {
						System.out.println("A ordem crescente dos n�meros �: " + segundoN + " " + primeiroN + " " + terceiroN);
					}
					else {
						System.out.println("A ordem crescente dos n�meros �: " + segundoN + " " + terceiroN + " " + primeiroN);
					}
				}
				else if(terceiroN < primeiroN) {
					if(terceiroN < segundoN) {
						System.out.println("A ordem crescente dos n�meros �: " + terceiroN + " " + segundoN + " " + primeiroN);
					}
				}
				leia.close();	
			

	}

}
