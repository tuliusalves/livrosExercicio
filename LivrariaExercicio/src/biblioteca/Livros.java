package biblioteca;

public class Livros {
	private String titulo;
	private String autor;
	
	public Livros() {}

	public Livros(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
}
