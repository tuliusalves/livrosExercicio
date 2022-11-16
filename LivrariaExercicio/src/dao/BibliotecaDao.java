package dao;

import biblioteca.Livros;

public interface BibliotecaDao {
	public void adicionarLivro();
	public void removerLivro();
	public void alterarLivro();
	public void listarLivros(Livros livro);
}
