package programacaosequencial;

import java.util.Scanner;

public class sequencial7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7. Escreva um algoritmo que leia os coeficientes a,b,c,d,e,f
				// e também calcule e mostre os valores de x e y:
				
				Scanner leia = new Scanner(System.in);
				
				//Coeficientes
				float a, b, c, d, e, f, x, y;

				System.out.println("\nO valor de A é: ");
				a = leia.nextFloat();

				System.out.println("Digite o valor de B: ");
				b = leia.nextFloat();

				System.out.println("Digite o valor de C: ");
				c = leia.nextFloat();

				System.out.println("Digite o valor de D: ");
				d = leia.nextFloat();

				System.out.println("Digite o valor de E: ");
				e = leia.nextFloat();

				System.out.println("Digite o valor de F: ");
				f = leia.nextFloat();

				x = ((c*e) - (b*f)) / ((a*e) - (b*d));
				y = ((a*f) * (c*d)) / ((a*e) - (b*d));

				System.out.println("\nO valor de X é: " + x + " e o valor de Y é: " + y);
				
				leia.close();

	}

}
