package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {
		
		if (autor == null) {
			throw new AutorNuloException("O Autor do Livro não pode ser nulo");
		}
		
		this.autor = autor;
		this.isbn = "00-00-00000-00-0";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("ISBN: " + this.isbn);
		
		if(temAutor()) {
			autor.toString();
		}
		System.out.println("---");
		return "";
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	
}
	