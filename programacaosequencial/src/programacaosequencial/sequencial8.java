package programacaosequencial;

import java.util.Scanner;

public class sequencial8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//O custo ao consumidor de um carro novo é a soma do custo de fábrica
		//com a percentagem do distribuidor e dos impostos 
		//(aplicados ao custo de fábrica).
		//Supondo que a percentagem do distribuidor seja de 28% 
		//e os impostos de 45%,
		//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		
Scanner leia = new Scanner(System.in);
		
		int custo, total;
        
		System.out.println("Qual é o custo de fabricação do veículo? ");
		custo = leia.nextInt();

		// % do distribuidor 28%
		// % de impostos 45%
		total = ((custo / 100) * 28) + ((custo / 100) * 45) + custo;

		System.out.println("O custo do veículo para o consumidor será de " + total + " reais.");
		
		leia.close();


	}

}
