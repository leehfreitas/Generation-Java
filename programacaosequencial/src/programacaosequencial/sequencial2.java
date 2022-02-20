package programacaosequencial;

import java.util.Scanner;

public class sequencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses
				//e dias.
				
				Scanner leia = new Scanner(System.in);
				
				int idade, anos, meses, dias;
				
				System.out.println("Quantos dias de idades você tem? ");
				dias = leia.nextInt();
				
				anos = (dias / 365); //Divisão
				meses = ((dias % 365) / 30); //RestoDivisão e Divisão
				dias = ((dias % 365) % 30); //Divisão
				
				System.out.println("Você tem " + anos + " anos, " + meses + " meses, e " + dias + " dias.");
				
				leia.close();

	}

}
