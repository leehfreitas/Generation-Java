package programacaosequencial;

import java.util.Scanner;

public class sequecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa
				//apenas em dias.
				
				Scanner leia = new Scanner(System.in);

				int idade, anos, meses, dias;
				
				System.out.println("Quantos anos voc� tem? ");
				anos = leia.nextInt();
				
				System.out.println(anos + " e quantos meses? ");
				meses = leia.nextInt();
				
				System.out.println("H� quantos dias voc� completou " + anos + " anos e " + meses + " meses? ");
				dias = leia.nextInt();
				
				idade = (365 * anos) + (30 * meses) + dias;
				
				System.out.println("Voc� nasceu h� " + idade + " dias. ");
						
				leia.close();
			

	}

}
