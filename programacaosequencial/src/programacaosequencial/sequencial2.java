package programacaosequencial;

import java.util.Scanner;

public class sequencial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses
				//e dias.
				
				Scanner leia = new Scanner(System.in);
				
				int idade, anos, meses, dias;
				
				System.out.println("Quantos dias de idades voc� tem? ");
				dias = leia.nextInt();
				
				anos = (dias / 365); //Divis�o
				meses = ((dias % 365) / 30); //RestoDivis�o e Divis�o
				dias = ((dias % 365) % 30); //Divis�o
				
				System.out.println("Voc� tem " + anos + " anos, " + meses + " meses, e " + dias + " dias.");
				
				leia.close();

	}

}
