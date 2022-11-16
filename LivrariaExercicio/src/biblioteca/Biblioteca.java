package biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	public void adicionarLivro( ) {
		/*adicionado o objeto de retorno do método de adição de dados
		 * Obs: Chama-lo dentro da adição irá executar o método, então
		 * não será necessário chama-lo isoladamente dentro de outro método. */
		livrosLista.add(addInformacao());
	}
	public void removerLivro() {
		int indice=(Integer.parseInt(JOptionPane.showInputDialog("Número do índice a remover")));
		livrosLista.remove(indice);
	}
	
	public void alterarLivro() {
		int indiceLivros= Integer.parseInt(JOptionPane.showInputDialog("Digite o íncie do livro"
				+ " que quer alterar:"));
		//livrosLista.remove(indiceLivros);
		livrosLista.set(indiceLivros,addInformacao());
	}
	
	//Método para inserir informações
	public Livros addInformacao() {
		Livros livros = new Livros();
		String autor= JOptionPane.showInputDialog("Digite o nome do autor:");
		String titulo= JOptionPane.showInputDialog("Digite o nome do título do livro");
		livros.setTitulo(autor);
		livros.setAutor(titulo);
		//Retornar objeto do mesmo tipo da classe
		return livros;
	}
	
	public void listarLivros(Livros livros) {
		for(Livros x: livrosLista) {
			System.out.println("Nome da biblioteca: "+ getNome()+" " +x.toString());
		}
	}
}
