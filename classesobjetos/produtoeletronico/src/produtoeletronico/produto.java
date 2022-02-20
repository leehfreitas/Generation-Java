package produtoeletronico;

import java.util.Scanner;

public class produto {
	
Scanner leia2 = new Scanner(System.in);
	
	//Atributos PRIVADOS
	private String marca, cor;
	private int armazenamento, duracaobateria, conexaointernet;
	
		//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getArmazenamento() {
			return armazenamento;
		}
		public void setArmazenamento(int armazenamento) {
			this.armazenamento = armazenamento;
		}
		public int getDuracaobateria() {
			return duracaobateria;
		}
		public void setDuracaobateria(int duracaobateria) {
			this.duracaobateria = duracaobateria;
		}
		public int getConexaointernet() {
			return conexaointernet;
		}
		public void setConexaointernet(int conexaointernet) {
			this.conexaointernet = conexaointernet;
		}
		void Conexao() {
			System.out.println("Deseja conectar o dispositivo a internet?" +  "\n" +  "|1| - Sim " +  "\n" + "|0| - Não");
			conexaointernet = leia2.nextInt();
			
			if(conexaointernet == 1) {
				System.out.println("Conectando o dispositivo à internet...");
			}
			else {
				System.out.println("Encerrando... sinal de rede desconectado.");
		}
		leia2.close();
	}

}
