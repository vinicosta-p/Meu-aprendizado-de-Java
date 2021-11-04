package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompra {
	
	private double total; 
	private Produto[] produto = new Produto[10];
	private int contador = 0;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produto[contador] = produto;
		contador++;
		this.total += produto.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
	public Produto[] getProduto() {
		return produto;
	}
}
