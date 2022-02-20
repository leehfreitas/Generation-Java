package aviao;

public class aviao {
	//Atributos PRIVADOS
		private String fabricante, modelo, cor;
		private int altitudemax;
		private int velocidademax;
		
		//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getAltitudemax() {
			return altitudemax;
		}
		public void setAltitudemax(int altitudemax) {
			this.altitudemax = altitudemax;
		}
		public int getVelocidademax() {
			return velocidademax;
		}
		public void setVelocidademax(int velocidademax) {
			this.velocidademax = velocidademax;
		}
}
