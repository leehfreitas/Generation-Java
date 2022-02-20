package repetiçao;

import java.util.Scanner;

public class repeticao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		//5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		//No final, mostre a soma dos números	digitados.(DO...WHILE)
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número do teclado: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
		}
		
		while(numero != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
		leia.close();

	}

}
