package la�ocondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
				Scanner leia = new Scanner(System.in);
				
				int num1, num2, num3, MaiorNum = 0;
				
				System.out.println("Digite o n�mero 01: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite o n�mero 02: ");
				num2 = leia.nextInt();
				
				System.out.println("Digite o n�mero 03:");
				num3 = leia.nextInt();
				
				if(num1 > MaiorNum) {
					MaiorNum = num1;
				}
				if(num2 > MaiorNum) {
					MaiorNum = num2;
				}
				if(num3 > MaiorNum) {
					MaiorNum = num3;
				}
				System.out.println("O valor maior �: " + MaiorNum);
				
				leia.close();
			}

	

}
