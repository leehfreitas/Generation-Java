package patinete;

public class patinete {
	
	private String tipo, modalidade;
	private double pre�o; 
	
	//Getter e Setter - Acessar os dados privados (bot�o direito -> source -> generate setters e getters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	void desenhopatinete() {
	System.out.println("T");
	System.out.println("|");
	System.out.println("|________________");
	System.out.println("  O           O");
	}

}
