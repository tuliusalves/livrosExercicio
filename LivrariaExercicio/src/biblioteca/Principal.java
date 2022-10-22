package biblioteca;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblioteca = new Biblioteca();
		Livros livros = new Livros();
		
		biblioteca.setNome("Fuctura ");
		
		
		biblioteca.adicionarLivro("Ruth","Matm. vol1");

		biblioteca.adicionarLivro("Kevin","Filosofia2");
		
		biblioteca.removerLivro(1);
		biblioteca.listarLivros(livros);
		
		
	}

}
