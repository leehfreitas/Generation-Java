package programacaosequencial;

import java.util.Scanner;

public class sequencial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e
				//mostre-o expresso em horas, minutos e segundos.
				
				Scanner leia = new Scanner(System.in);
				
				int tempo, horas, minutos, segundos;
				
				System.out.println("Quantos segundos de dura��o ter� o evento? ");
				segundos = leia.nextInt();
				
				horas = (segundos / 3600); //Divis�o
				minutos = ((segundos % 3600) / 60); //RestoDivis�o e Divis�o
				segundos = ((segundos % 3600) % 60); //RestoDivis�o e Divis�o
				
				System.out.println("O evento ter� a dura��o de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
				
				leia.close();

	}

}
