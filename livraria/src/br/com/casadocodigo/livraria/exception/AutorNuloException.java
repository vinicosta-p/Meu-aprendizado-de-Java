package br.com.casadocodigo.livraria.exception;

@SuppressWarnings("serial")
public class AutorNuloException extends RuntimeException {
	
	public AutorNuloException(String mensagem) {
		super(mensagem);
	}

}
