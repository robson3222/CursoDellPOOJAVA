package aula;

public class Principal {

	public static void main(String[] args) {
		
		Aluno alunolead = new Aluno ("rob", 9,10, 10);
		System.out.println(alunolead.nome);
		System.out.println(alunolead.codigo);
		System.out.println(alunolead.nota1);
		System.out.println(alunolead.nota2);
		
		
	     Novoaluno joao = new Novoaluno();
	        joao.setNome("jaime");
	        joao.setCodigo(1);
	        joao.setNota1(7);
	        joao.setNota2(9);
	        joao.somar();
	      
	        System.out.println(joao.getNome());
	        System.out.println(joao.getCodigo());
	        System.out.println( joao.getNota1());
	        System.out.println(joao.getNota2());
	            System.out.println(joao.somar());

	
	
	
	}

}
