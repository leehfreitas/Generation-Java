package laçocondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.
		
				Scanner leia = new Scanner(System.in);
				
				int num1, num2, num3, MaiorNum = 0;
				
				System.out.println("Digite o número 01: ");
				num1 = leia.nextInt();
				
				System.out.println("Digite o número 02: ");
				num2 = leia.nextInt();
				
				System.out.println("Digite o número 03:");
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
				System.out.println("O valor maior é: " + MaiorNum);
				
				leia.close();
			}

	

}
