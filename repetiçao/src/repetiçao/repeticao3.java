package repeti�ao;

import java.util.Scanner;
public class repeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3-	Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
				//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
				
				//Vari�veis
				Scanner leia = new Scanner(System.in);
				
				int idade = 0, menor21 = 0, maior50 = 0;

				while(idade != -99) {
					System.out.println("Digite a sua idade: ");
					idade = leia.nextInt();
					
					if(idade < 21 && idade >= 0) {
						menor21++; //ca�ador de idade menor de 21
					}
					else if(idade > 50) {
						maior50++; //ca�ador de idade maior que 50
					}
				}
				System.out.println("A quantidade de pessoas que possuem idade inferior a 21 anos � de : " + menor21);
				System.out.println("A quantidade de pessoas que possuem idade superior a 50 anos � de : " + maior50);
				leia.close();

	}

}
