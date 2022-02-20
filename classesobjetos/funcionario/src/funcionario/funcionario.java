package funcionario;

import java.util.Scanner;

public class funcionario {
	
Scanner logar = new Scanner(System.in);
	
	//Atributos PRIVADOS
	private String nome, cargo;
	private int numregistro, entradasist;
		
		//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public int getNumRegistro() {
			return numregistro;
		}
		public void setNumRegistro(int numregistro) {
			this.numregistro = numregistro;
		}
		public int getEntradasist() {
			return entradasist;
		}
		public void setEntradasist(int entradasist) {
			this.entradasist = entradasist;
		}
		void Conexao() {
			System.out.println("Deseja entrar no sistema da empresa? " +  "\n" +  "|1| - Sim " +  "\n" + "|0| - Não");
			entradasist = logar.nextInt();
		
		if(entradasist == 1) {
			System.out.println("Entrando no sistema da empresa...");
		}
		else {
			System.out.println("Encerrando.");
		}
		logar.close();
	}

}
