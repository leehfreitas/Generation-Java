package patinete;

public class testepatinete {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
		//em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		patinete tipo1 = new patinete();
        patinete tipo2 = new patinete();
        patinete tipo3 = new patinete();
        
        tipo1.setTipo("|Patinete Elétrico Xiaomi Mi Essential Bluetooth|"); //Alterando o atributo através do método setMarca
        tipo1.setModalidade("|Uso Livre|");
        tipo1.setPreço(2788.99);
        
        tipo2.setTipo("|Patinete Infantil Alumínio|");
        tipo2.setModalidade("|Para crianças|");
        tipo2.setPreço(177.99);
        
        tipo3.setTipo("|Patinete Elétrico SEGWAY SN ETRIP|");
        tipo3.setModalidade("|Uso Profissional|");
        tipo3.setPreço(4799.00);
        
        System.out.println(); //" --> Recuperando os dados do atributo através do método getMarca
        System.out.println("O tipo do patinete nº1 é: " + tipo1.getTipo());
        System.out.println("A modalidade recomendada é: " + tipo1.getModalidade());
        System.out.println("O patinete custa: R$ " + tipo1.getPreço());
        System.out.println();
        tipo2.desenhopatinete();
        System.out.println("\nO tipo do patinete nº2 é: " + tipo2.getTipo());
        System.out.println("A modalidade recomendada é: " + tipo2.getModalidade());
        System.out.println("O patinete custa: R$ " + tipo2.getPreço());
        System.out.println();
        tipo3.desenhopatinete();
        System.out.println("\nO tipo do patinete nº3 é: " + tipo3.getTipo());
        System.out.println("A modalidade recomendada é: " + tipo3.getModalidade());
        System.out.println("O patinete custa: R$ " + tipo3.getPreço());
        System.out.println();
        tipo3.desenhopatinete();
	}

}
