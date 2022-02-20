package programacaosequencial;

import java.util.Scanner;

public class sequecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa
				//apenas em dias.
				
				Scanner leia = new Scanner(System.in);

				int idade, anos, meses, dias;
				
				System.out.println("Quantos anos você tem? ");
				anos = leia.nextInt();
				
				System.out.println(anos + " e quantos meses? ");
				meses = leia.nextInt();
				
				System.out.println("Há quantos dias você completou " + anos + " anos e " + meses + " meses? ");
				dias = leia.nextInt();
				
				idade = (365 * anos) + (30 * meses) + dias;
				
				System.out.println("Você nasceu há " + idade + " dias. ");
						
				leia.close();
			

	}

}
