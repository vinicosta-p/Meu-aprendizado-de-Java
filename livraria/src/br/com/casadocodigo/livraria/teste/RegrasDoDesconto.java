package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegrasDoDesconto {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
	
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
	
		if(!ebook.aplicaDesconto(0.15)) {
			System.out.println("Desconto do ebook nao pode ser maior que 15%");
		} else {
			System.out.println("Valor do livro com desconto: " + ebook.getValor());
		}
	}
	
}
