package contabancaria;

import java.util.Scanner;

public class contabancaria {
	
Scanner leia = new Scanner(System.in);
	
	//6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
	//em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	//Atributos PRIVADOS
	private int numeroconta;
	private String usuario;
	private double saldo;
	
	//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private String login;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	private int senha;
	
	void Entrar() {
	
		System.out.println("Informe seu login: "); // 1) Informe o seu login
	    	String login = leia.nextLine();
	    System.out.println("Digite sua senha: "); // 2) Informe a sua senha
	    	String senha = leia.nextLine();
	        
	    if(login.equals("Admin") && senha.equals("123")){  // 3) Armazenar em variaveis o login e a senha e verificar se estão corretos.
	        System.out.printf("\n" + "%s logado com sucesso.", login);
	    }
	    else{
	        System.out.println("Login ou senha inválidos. "
	        		+ "Os dados do último acesso são: ");
	        leia.close();
	    }
	}

}
