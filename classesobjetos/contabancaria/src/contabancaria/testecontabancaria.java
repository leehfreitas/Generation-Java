package contabancaria;



public class testecontabancaria {
	
	public static void main(String[] args) {
		
		contabancaria c1 = new contabancaria();
		contabancaria c2 = new contabancaria();
		contabancaria c3 = new contabancaria();
		contabancaria loginc = new contabancaria();
		
		loginc.Entrar();
		
		c1.setUsuario("Azir");
		c1.setNumeroconta(5767-8);
		c1.setSaldo(29999.8);
		
		c2.setUsuario("Katarina");
		c2.setNumeroconta(1564-6);
		c2.setSaldo(1008467.98);
		
		c3.setUsuario("Samira");
		c3.setNumeroconta(5297-4);
		c3.setSaldo(-40000.68);
		
		System.out.println();
		System.out.println("\n" + "A conta nº1 cadastrada pertence ao usuário: " + c1.getUsuario());
		System.out.println("O numero de sua conta é " + c1.getNumeroconta());
		System.out.println("Seu saldo é de: R$ " + c1.getSaldo() + " reais. ");
	
		System.out.println("\n" + "A conta nº2 cadastrada pertence ao usuário: " + c2.getUsuario());
		System.out.println("O numero de sua conta é " + c2.getNumeroconta());
		System.out.println("Seu saldo é de: R$ " + c2.getSaldo()+ " reais. ");

		System.out.println("\n" + "A conta nº3 cadastrada pertence ao usuário: " + c3.getUsuario());
		System.out.println("O numero de sua conta é " + c3.getNumeroconta());
		System.out.println("Seu saldo é de: R$ " + c3.getSaldo()+ " reais. ");
	}
}
