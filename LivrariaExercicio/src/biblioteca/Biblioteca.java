package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	ArrayList <Livros> livrosLista= new ArrayList<>();
	
	
	public Biblioteca() {}
	public Biblioteca(String nome, ArrayList<Livros> livrosLista) {
		super();
		this.nome = nome;
		this.livrosLista = livrosLista;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Livros> getLivrosLista() {
		return livrosLista;
	}
	public void setLivrosLista(ArrayList<Livros> livrosLista) {
		this.livrosLista = livrosLista;
	}
	
	
	public void adicionarLivro(String autor, String titulo ) {
		Livros livros = new Livros();
		livros.setTitulo(autor);
		livros.setAutor(titulo);
		livrosLista.add(livros);
	}
	public void removerLivro(int indice) {
		livrosLista.remove(indice);
	}
	public void listarLivros(Livros livros) {
		for(Livros x: livrosLista) {
			System.out.println("Nome da biblioteca: "+ getNome()+" " +x.toString());
		}
	}
}
