package funcionario;

import java.util.Scanner;

public class testefuncionario {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
		//em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Funcion�rio, digite seu nome: ");
		String nome = scan.next();
			
		System.out.println("Informe o cargo que ocupa na empresa: ");
		String cargo = scan.next();
			
		System.out.println("Digite seu c�digo de registro (04 d�gitos): ");
		int num = scan.nextInt();
			
		funcionario func1 = new funcionario();
		
		func1.setNome(nome);
		func1.setCargo(cargo);
		func1.setNumRegistro(num);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo marca atrav�s do m�todo getMarca
		System.out.println("|Nome do Funcion�rio|: " + func1.getNome());
		System.out.println("|Cargo do Funcion�rio|: " + func1.getCargo());
		System.out.println("|C�digo de Registro do Funcion�rio|: " + func1.getNumRegistro());
		System.out.print("\n");
		func1.Conexao();
		System.out.print("\n");
		System.out.println("Aguarde...");
		scan.close();
		}

}
