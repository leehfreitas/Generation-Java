package la�ocondicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3-	Fa�a um programa que receba a idade de uma pessoa e 
				// mostre na sa�da em qual categoria ela se encontra:	�	10-14 infantil; 15-17 juvenil; 18-25 adulto;

				Scanner leia = new Scanner(System.in);
				
				int idadeP;
				
				System.out.println("Digite sua idade para descobrir em qual categoria voc� se encontra: ");
				idadeP = leia.nextInt();
				
				if(idadeP >= 10 && idadeP <= 14) {
					System.out.println("\n" + "Voc� se encontra na categoria Infantil (10-14)! ");
				}
				else if(idadeP >= 15 && idadeP <= 17) {
					System.out.println("\n" + "Voc� se encontra na categoria Juvenil (15-17)! ");
				}
				else if(idadeP >= 18 && idadeP <= 25) {
					System.out.println("\n" + "Voc� se encontra na categoria Adulto (18-25)! ");
				}
				leia.close();	
			

	}

}
