package produtoeletronico;

import java.util.Scanner;

public class testeproduto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe,
		//em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a marca do aparelho: | Apple | Samsung | Outras |: ");
		String marca = leia.next();
		
		System.out.println("Informe a cor do aparelho: ");
		String cor = leia.next();
		
		System.out.println("Informe o limite de armazenamento (gb) do aparelho: ");
		int armazenamento = leia.nextInt();
		
		System.out.println("Informe a dura��o da bateria do aparelho: ");
		int duracaobateria = leia.nextInt();
		
		produto produtoeletro1 = new produto();
		
		produtoeletro1.setMarca(marca); //Alterando o atributo marca atrav�s do m�todo setMarca
		produtoeletro1.setCor(cor);
		produtoeletro1.setArmazenamento(armazenamento);
		produtoeletro1.setDuracaobateria(duracaobateria);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo marca atrav�s do m�todo getMarca
		System.out.println("A marca do produto eletr�nico �: " + produtoeletro1.getMarca()); 
		System.out.println("A cor �: " + produtoeletro1.getCor());
		System.out.println("Possui: " + produtoeletro1.getArmazenamento() + " gb de armazenamento. ");
		System.out.println("A bateria tem " + produtoeletro1.getDuracaobateria() + " horas de vida �til de utiliza��o. ");
		System.out.print("\n");
		produtoeletro1.Conexao();
		leia.close();	
	}

}
