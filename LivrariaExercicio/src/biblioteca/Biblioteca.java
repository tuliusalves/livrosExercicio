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
		/*adicionado o objeto de retorno do m�todo de adi��o de dados
		 * Obs: Chama-lo dentro da adi��o ir� executar o m�todo, ent�o
		 * n�o ser� necess�rio chama-lo isoladamente dentro de outro m�todo. */
		livrosLista.add(addInformacao());
	}
	public void removerLivro() {
		int indice=(Integer.parseInt(JOptionPane.showInputDialog("N�mero do �ndice a remover")));
		livrosLista.remove(indice);
	}
	
	public void alterarLivro() {
		int indiceLivros= Integer.parseInt(JOptionPane.showInputDialog("Digite o �ncie do livro"
				+ " que quer alterar:"));
		//livrosLista.remove(indiceLivros);
		livrosLista.set(indiceLivros,addInformacao());
	}
	
	//M�todo para inserir informa��es
	public Livros addInformacao() {
		Livros livros = new Livros();
		String autor= JOptionPane.showInputDialog("Digite o nome do autor:");
		String titulo= JOptionPane.showInputDialog("Digite o nome do t�tulo do livro");
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
