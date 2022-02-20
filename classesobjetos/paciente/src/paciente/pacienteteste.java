package paciente;

public class pacienteteste {
	
	public static void main(String[] args) {
	
	paciente pac = new paciente();
	
	((paciente) pac).setNome("leticia");
	pac.setGenero("freitas");
	pac.setIdade(18);
	
	System.out.println();
	System.out.println("||||||||||||||||||||||||||||");
	System.out.println("|Nome do Paciente: " + pac.getNome() + " |");
	System.out.println("|Gênero do Paciente: " + pac.getGenero() + "|");
	System.out.println("|Idade do Paciente: " + pac.getIdade() + "     |");
	System.out.println("||||||||||||||||||||||||||||");
	
	System.out.println();
	System.out.println("Iniciando Cadastro do Paciente:");
	pac.FazerCadastro();
	System.out.println();
	
	System.out.println("Agendar consulta para o Paciente? ");
	pac.FazerCadastro();
	System.out.println();
			
	System.out.println("Pedir receita de medicamentos para o paciente? ");
	pac.FazerCadastro();

	}
}
