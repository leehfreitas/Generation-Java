package laçocondicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2-	Faça um programa que entre com três números e
				// coloque em ordem crescente.
				
				Scanner leia = new Scanner(System.in);
				
				int primeiroN, segundoN, terceiroN;
				
				System.out.println("Entre com o 1º número: ");
				primeiroN = leia.nextInt();
				
				System.out.println("Entre com o 2º número: ");
				segundoN = leia.nextInt();
				
				System.out.println("Entre com o 3º número: ");
				terceiroN = leia.nextInt();
				
				if(primeiroN < segundoN) {
					if(segundoN < terceiroN) {
						System.out.println("A ordem crescente dos número é : " + primeiroN + " " + segundoN + " " + terceiroN);
					}
					else if(primeiroN < terceiroN) {
						System.out.println("A ordem crescente dos números é: " + primeiroN + " " + terceiroN + " " + segundoN);				
					}
					else {
						System.out.println("A ordem crescente dos números é: " + terceiroN + " " + primeiroN + " " + segundoN);
					}		
				}		
				else if(segundoN < terceiroN) {
					if(primeiroN < terceiroN) {
						System.out.println("A ordem crescente dos números é: " + segundoN + " " + primeiroN + " " + terceiroN);
					}
					else {
						System.out.println("A ordem crescente dos números é: " + segundoN + " " + terceiroN + " " + primeiroN);
					}
				}
				else if(terceiroN < primeiroN) {
					if(terceiroN < segundoN) {
						System.out.println("A ordem crescente dos números é: " + terceiroN + " " + segundoN + " " + primeiroN);
					}
				}
				leia.close();	
			

	}

}
