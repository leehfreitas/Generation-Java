package patinete;

public class testepatinete {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5) Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe,
		//em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		
		patinete tipo1 = new patinete();
        patinete tipo2 = new patinete();
        patinete tipo3 = new patinete();
        
        tipo1.setTipo("|Patinete El�trico Xiaomi Mi Essential Bluetooth|"); //Alterando o atributo atrav�s do m�todo setMarca
        tipo1.setModalidade("|Uso Livre|");
        tipo1.setPre�o(2788.99);
        
        tipo2.setTipo("|Patinete Infantil Alum�nio|");
        tipo2.setModalidade("|Para crian�as|");
        tipo2.setPre�o(177.99);
        
        tipo3.setTipo("|Patinete El�trico SEGWAY SN ETRIP|");
        tipo3.setModalidade("|Uso Profissional|");
        tipo3.setPre�o(4799.00);
        
        System.out.println(); //" --> Recuperando os dados do atributo atrav�s do m�todo getMarca
        System.out.println("O tipo do patinete n�1 �: " + tipo1.getTipo());
        System.out.println("A modalidade recomendada �: " + tipo1.getModalidade());
        System.out.println("O patinete custa: R$ " + tipo1.getPre�o());
        System.out.println();
        tipo2.desenhopatinete();
        System.out.println("\nO tipo do patinete n�2 �: " + tipo2.getTipo());
        System.out.println("A modalidade recomendada �: " + tipo2.getModalidade());
        System.out.println("O patinete custa: R$ " + tipo2.getPre�o());
        System.out.println();
        tipo3.desenhopatinete();
        System.out.println("\nO tipo do patinete n�3 �: " + tipo3.getTipo());
        System.out.println("A modalidade recomendada �: " + tipo3.getModalidade());
        System.out.println("O patinete custa: R$ " + tipo3.getPre�o());
        System.out.println();
        tipo3.desenhopatinete();
	}

}
