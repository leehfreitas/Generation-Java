package programacaosequencial;

import java.util.Scanner;

public class sequencial4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte
				//express�o: D = R + S/2 onde R = (A+B)� e S = (B+C)�
				
				Scanner leia = new Scanner(System.in);
				
				double a, b, c, d, r, s;
				
				System.out.println("Escreva o valor de A: ");
				a = leia.nextInt();
				
				System.out.println("Escreva o valor de B: ");
				b = leia.nextInt();
				
				System.out.println("Escreva o valor de C: ");
				c = leia.nextInt();
				
				r = (int) Math.pow((a + b), 2.0); // ou (a + b) * (a + b);
				s = (int) Math.pow((b + c), 2.0); // ou (b + c) * (b + c);
				d = (r + s) /  2;

				System.out.println("O resultado da express�o �: " + d);
				
				leia.close();

	}

}
