package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}
}
