package programacaosequencial;

import java.util.Scanner;

public class sequencial5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que
				//a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.
				
				Scanner leia = new Scanner(System.in);
				
				double mediafinal;
				double notaA, notaB, notaC;
				double notaAtot, notaBtot, notaCtot;

				System.out.println("Digite a primeira nota: ");
				notaA = leia.nextDouble();

				System.out.println("Digite a segunda nota: ");
				notaB = leia.nextDouble();

				System.out.println("Digite a terceira nota: ");
				notaC = leia.nextDouble();

				notaAtot = (notaA * 2.0); //Média ponderada
				notaBtot = (notaB * 3.0); //Média ponderada
				notaCtot = (notaC * 5.0); //Média ponderada

				mediafinal = (notaAtot + notaBtot + notaCtot) / 10;

				System.out.println("\nA média final do aluno é " + mediafinal + ".");
				
				leia.close();

	}

}
