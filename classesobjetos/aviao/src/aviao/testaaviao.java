package aviao; 
    
import java.util.Scanner;

public class testaaviao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
		//em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do avi�o: | Boeing | Embraer | Airbus |: ");
		String fabricante = leia.next();
		System.out.println("Digite o modelo do avi�o: | Comercial | Cargueiro | Ca�a |: ");
		String modelo = leia.next();
		System.out.println("Digite a cor do avi�o: ");
		String cor = leia.next();
		System.out.println("Digite a altitude m�xima do avi�o: ");
		int altitudemax = leia.nextInt();
		System.out.println("Digite a velocidade m�xima do avi�o: ");
		int velocidademax = leia.nextInt();
		
		aviao aviao1 = new aviao();
		
		aviao1.setFabricante(fabricante); //Alterando o atributo atrav�s do m�todo setMarca
		aviao1.setModelo(modelo);
		aviao1.setCor(cor);
		aviao1.setVelocidademax(velocidademax);
		aviao1.setAltitudemax(altitudemax);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo atrav�s do m�todo getMarca
		System.out.println("A fabricante do avi�o � a: " + aviao1.getFabricante()); 
		System.out.println("O avi�o � do modelo: " + aviao1.getModelo());
		System.out.println("Possui a cor: " + aviao1.getCor());
		System.out.println("Alcan�a a altitude m�xima de: " + aviao1.getAltitudemax() + " mil p�s de altitude. ");
		System.out.println("Possui a velocidade m�xima de: " + aviao1.getVelocidademax() + " quil�metros por hora. ");
		leia.close();
	}

}
