package repeti�ao;

import java.util.Scanner;

public class repeticao2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner leia = new Scanner(System.in);
		
		int numero, i, par = 0, impar = 0;
		
		for( i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + "� n�mero");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++; //ca�ador de numeros pares
			}
			if(numero % 2 == 1) {
				impar++; //ca�ador de numeros impares
			}
		}
		System.out.println("Total de n�meros pares: " + par);
		System.out.println("Total de n�meros �mpares: " + impar);	
		leia.close();
	}

}
