package repetiçao;

import java.util.Scanner;

public class repeticao2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner leia = new Scanner(System.in);
		
		int numero, i, par = 0, impar = 0;
		
		for( i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + "º número");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++; //caçador de numeros pares
			}
			if(numero % 2 == 1) {
				impar++; //caçador de numeros impares
			}
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);	
		leia.close();
	}

}
