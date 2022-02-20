package repetiçao;

public class repeticao {
	
	public static void main(String[] args) throws InterruptedException{
		
		// 1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
				System.out.println("Mostrando os números de 1000 até 1999, que quando divididos por 11 resta 5: ");
				for(int i = 1000; i <2000; i++)
				{
					if(i % 11 == 5)
					{
						System.out.println(i);
						Thread.sleep(100);
					}
				}
		
	}
		
	

}
