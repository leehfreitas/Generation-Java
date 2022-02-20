package colletions;

import java.util.ArrayList;

public class colletions {


		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.*/

		public class estoque {

			public static void main(String[] args) {
				String estoque1 = "Iphone";
				String estoque2 = "Samsung";
				String estoque3 = "Motorola";
				String estoque4 = "LG";
				String estoque5 = "Nokia";

				ArrayList<String> estoque = new ArrayList<>();
				estoque.add(estoque1);
				estoque.add(estoque2);
				estoque.add(estoque3);
				estoque.add(estoque4);

				System.out.println(estoque);

				estoque.add(estoque5);
				System.out.println(estoque);

				estoque.remove(0);
				System.out.println(estoque);

				for(String i: estoque) {
					System.out.println("Temos os celulares: " + i);
				}


			}
		
		}
    }
}