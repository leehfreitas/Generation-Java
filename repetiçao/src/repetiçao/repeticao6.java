package repeti�ao;

import java.util.Scanner;
public class repeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6-	Escrever um programa que receba v�rios n�meros inteiros no teclado. 
				// E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
				
				Scanner leia = new Scanner(System.in);
				
				int num;
				double media, multiplosdetres = 0.0, soma = 0.0;
				
				do {
					System.out.println("Digite um n�mero INTEIRO: ");
					num = leia.nextInt();
					
					if(num % 3 == 0 && num != 0) {
						multiplosdetres++;
						soma = soma + num;
					}
				}
				while(num != 0);
				
				media = soma / multiplosdetres;
					
				System.out.println("A m�dia dos n�meros digitados que s�o n�meros m�ltiplos de 3 �: " + media);

	}

}
