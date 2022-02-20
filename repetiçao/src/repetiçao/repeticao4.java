package repetiçao;

import java.util.Scanner;

public class repeticao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
				//Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
				//e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
				//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
				
				Scanner leia = new Scanner(System.in);
				
				//Variáveis
				int idade, sexo, caracpsico,
					calmo = 0, Mnerv = 0, Hagressivo = 0, OutrosCalm = 0, HvelhoNerv = 0, MenorCalm = 0,
					hab = 1;
				
				while(hab <= 150) {

					System.out.println("\n" + "Pessoa nº. " + hab + "\n");
					
					System.out.println("Digite sua idade: ");
					idade = leia.nextInt();
					
					System.out.println("Sexo: Digite: (1 para feminino | 2 para masculino | 3 para outros)");
					sexo = leia.nextInt();
					
					System.out.println("Características: Digite: (1 para calmo | 2 para nervoso | 3 para agressivo)");
					caracpsico = leia.nextInt();
					
					hab++;	
					
					if(caracpsico == 1) {
						calmo++;
					}
					if(sexo == 1 && caracpsico == 2) {
						Mnerv++;
					}
					if(sexo == 2 && caracpsico == 3) {
						Hagressivo++;
					}
					if(sexo == 3 && caracpsico == 1) {
						OutrosCalm++;
					}
					if(idade > 40 && caracpsico == 2) {
						HvelhoNerv++;
					}
					if(idade < 18 && caracpsico == 1) {
						MenorCalm++;
					}
				}
				System.out.println("\n" + "Dentre os habitantes que fizeram parte desta pesquisa: \n");
				System.out.println("Quantia de pessoas que se consideram calmas: " + calmo);
				System.out.println("Quantia de mulheres que se consideram nervosas: " + Mnerv);
				System.out.println("Quantia de homens que se consideram agressivos: " + Hagressivo);
				System.out.println("Quantia de pessoas de outros gêneros se consideram calmas: " + OutrosCalm);
				System.out.println("Quantia de pessoas com mais de 40 anos se consideram nervosas: " + HvelhoNerv);
				System.out.println("Quantia de pessoas com menos de 18 anos se consideram calmas: " + MenorCalm);	

	}

}
