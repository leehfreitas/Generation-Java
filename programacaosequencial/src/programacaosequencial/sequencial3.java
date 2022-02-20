package programacaosequencial;

import java.util.Scanner;

public class sequencial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
				//mostre-o expresso em horas, minutos e segundos.
				
				Scanner leia = new Scanner(System.in);
				
				int tempo, horas, minutos, segundos;
				
				System.out.println("Quantos segundos de duração terá o evento? ");
				segundos = leia.nextInt();
				
				horas = (segundos / 3600); //Divisão
				minutos = ((segundos % 3600) / 60); //RestoDivisão e Divisão
				segundos = ((segundos % 3600) % 60); //RestoDivisão e Divisão
				
				System.out.println("O evento terá a duração de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
				
				leia.close();

	}

}
