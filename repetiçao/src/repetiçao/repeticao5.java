package repeti�ao;

import java.util.Scanner;

public class repeticao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		//5 - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		//No final, mostre a soma dos n�meros	digitados.(DO...WHILE)
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um n�mero do teclado: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
		}
		
		while(numero != 0);
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		leia.close();

	}

}
