package aviao; 
    
import java.util.Scanner;

public class testaaviao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
		//em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do avião: | Boeing | Embraer | Airbus |: ");
		String fabricante = leia.next();
		System.out.println("Digite o modelo do avião: | Comercial | Cargueiro | Caça |: ");
		String modelo = leia.next();
		System.out.println("Digite a cor do avião: ");
		String cor = leia.next();
		System.out.println("Digite a altitude máxima do avião: ");
		int altitudemax = leia.nextInt();
		System.out.println("Digite a velocidade máxima do avião: ");
		int velocidademax = leia.nextInt();
		
		aviao aviao1 = new aviao();
		
		aviao1.setFabricante(fabricante); //Alterando o atributo através do método setMarca
		aviao1.setModelo(modelo);
		aviao1.setCor(cor);
		aviao1.setVelocidademax(velocidademax);
		aviao1.setAltitudemax(altitudemax);
		
		System.out.print("\n"); //" --> Recuperando os dados do atributo através do método getMarca
		System.out.println("A fabricante do avião é a: " + aviao1.getFabricante()); 
		System.out.println("O avião é do modelo: " + aviao1.getModelo());
		System.out.println("Possui a cor: " + aviao1.getCor());
		System.out.println("Alcança a altitude máxima de: " + aviao1.getAltitudemax() + " mil pés de altitude. ");
		System.out.println("Possui a velocidade máxima de: " + aviao1.getVelocidademax() + " quilômetros por hora. ");
		leia.close();
	}

}
