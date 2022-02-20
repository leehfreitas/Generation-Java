package patinete;

public class patinete {
	
	private String tipo, modalidade;
	private double preço; 
	
	//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
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
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	void desenhopatinete() {
	System.out.println("T");
	System.out.println("|");
	System.out.println("|________________");
	System.out.println("  O           O");
	}

}
