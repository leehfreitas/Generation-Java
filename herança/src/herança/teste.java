package herança;

public class teste {

	public static void main(String[] args) {
		//Cachorro
				cachorro ch = new cachorro();
				
				ch.setNome("O nome do cachorro é: Otto.");
				ch.setIdade(5);
				ch.setEmitirsom("Au Au");
				ch.setMovimentacao("Correr.");
				
				System.out.println("Nome:  "+ch.getNome());
				System.out.println("Idade: "+ch.getIdade());
				System.out.println("Som:   "+ch.getEmitirsom());
				System.out.println("Movimentos:  "+ch.getMovimentacao());
				System.out.println();
				
				//Cavalo
				 cavalo cv = new cavalo();
				
				cv.setNome("O nome do cavalo é: Arceus.");
				cv.setIdade(11);
				cv.setEmitirsom("iiirrrrí, rilinchin");
				cv.setMovimentacao("Correr.");
				
				System.out.println("Nome:  "+cv.getNome());
				System.out.println("Idade: "+cv.getIdade());
				System.out.println("Som:   "+cv.getEmitirsom());
				System.out.println("Movimentos:  "+cv.getMovimentacao());
				System.out.println();
				
				//Preguiça
				preguiça pc = new preguiça();
				
				pc.setNome("O nome da preguiça é: Lento.");
				pc.setIdade(17);
				pc.setEmitirsom("...");
				pc.setMovimentacao("Subir em arvores.");
				
				System.out.println("Nome:  "+pc.getNome());
				System.out.println("Idade: "+pc.getIdade());
				System.out.println("Som:   "+pc.getEmitirsom());
				System.out.println("Movimentos:  "+pc.getMovimentacao());
				
			
	}

}
