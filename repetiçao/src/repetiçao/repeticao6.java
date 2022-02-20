package repetiçao;

import java.util.Scanner;
public class repeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6-	Escrever um programa que receba vários números inteiros no teclado. 
				// E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
				
				Scanner leia = new Scanner(System.in);
				
				int num;
				double media, multiplosdetres = 0.0, soma = 0.0;
				
				do {
					System.out.println("Digite um número INTEIRO: ");
					num = leia.nextInt();
					
					if(num % 3 == 0 && num != 0) {
						multiplosdetres++;
						soma = soma + num;
					}
				}
				while(num != 0);
				
				media = soma / multiplosdetres;
					
				System.out.println("A média dos números digitados que são números múltiplos de 3 é: " + media);

	}

}
