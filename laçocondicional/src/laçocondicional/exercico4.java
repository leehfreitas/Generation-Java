package la�ocondicional;

import java.util.Scanner;

public class exercico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
				//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

				Scanner leia = new Scanner(System.in);
				
				int num, raiz, pot;
			
				System.out.println("Escreva um n�mero qualquer: ");
				num = leia.nextInt();
			
				if(num % 2 == 0) {
					raiz = (int) Math.sqrt(num);
				System.out.println("\n" + "Este n�mero � par, e sua ra�z quadrada �: " + raiz);
				
				}
				if(num % 2 != 0) {
					pot = (int) Math.pow(num, 2.0);
				System.out.println("\n" + "Este num�ro � �mpar: " + num + ", e ele elevado ao quadrado(�) �: " + pot);
				
				}
				leia.close();

	}

}
