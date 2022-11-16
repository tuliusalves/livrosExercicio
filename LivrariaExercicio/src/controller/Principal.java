package controller;

import javax.swing.JOptionPane;

import biblioteca.Biblioteca;
import biblioteca.Livros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblioteca = new Biblioteca();
		Livros livros = new Livros();
		String nomeBiblioteca=(JOptionPane.showInputDialog("Insira o nome da biblioteca:"));
		biblioteca.setNome(nomeBiblioteca);
		int opcao=1;
		
		while(opcao!=0) {
			opcao= Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:"
					+ "\n 1-(Adicionar livro) \t 2-(Remover livro) 3-(Alterar livros)"
					+ "\n 4-(Listar livros) \t 0-(Sair)"));
			if(opcao==1) {
				biblioteca.adicionarLivro();
			}else if(opcao==2){
				biblioteca.removerLivro();
			}else if(opcao==3) {
				biblioteca.alterarLivro();
			}else if(opcao==4) {
				biblioteca.listarLivros(livros);
			}
			
		}
		
		
		
	}

}
