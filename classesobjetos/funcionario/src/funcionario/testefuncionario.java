package funcionario;

import java.util.Scanner;

public class testefuncionario {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
		//em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Funcionário, digite seu nome: ");
		String nome = scan.next();
			
		System.out.println("Informe o cargo que ocupa na empresa: ");
		String cargo = scan.next();
			
		System.out.println("Digite seu código de registro (04 dígitos): ");
		int num = scan.nextInt();
			
		funcionario func1 = new funcionario();
		
		func1.setNome(nome);
		func1.setCargo(cargo);
		func1.setNumRegistro(num);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo marca através do método getMarca
		System.out.println("|Nome do Funcionário|: " + func1.getNome());
		System.out.println("|Cargo do Funcionário|: " + func1.getCargo());
		System.out.println("|Código de Registro do Funcionário|: " + func1.getNumRegistro());
		System.out.print("\n");
		func1.Conexao();
		System.out.print("\n");
		System.out.println("Aguarde...");
		scan.close();
		}

}
