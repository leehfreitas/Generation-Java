package cliente;

import java.util.Scanner;

public class testecliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite apenas seu primeiro nome: ");
		String nome = leia.next();
		System.out.println("Digite seu sexo: | Masculino | Feminino | N�o Bin�rio |: ");
		String sexo = leia.next();
		System.out.println("Digite seu estado civil: | Solteiro(a) | Casado(a) | Vi�vo(a) |: ");
		String estadocivil = leia.next();
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		System.out.println("Digite quantos filhos voc� tem: ");
		int filhos = leia.nextInt();
		
		cliente cliente1 = new cliente();
		
		cliente1.setNome(nome); //Alterando o atributo atrav�s do m�todo setMarca
		cliente1.setSexo(sexo);
		cliente1.setEstadocivil(estadocivil);
		cliente1.setIdade(idade);
		cliente1.setFilhos(filhos);
		
		System.out.print("\n");
		System.out.println("O cliente: " + cliente1.getNome()); //" --> Recuperando os dados do atributo atrav�s do m�todo getMarca
		System.out.println("� do sexo: " + cliente1.getSexo());
		System.out.println("Seu estado civil �: " + cliente1.getEstadocivil());
		System.out.println("Tem a idade de: " + cliente1.getIdade() + " anos. ");
		System.out.println("Tem: " + cliente1.getFilhos() + " filhos. ");
		leia.close();
	}

}
