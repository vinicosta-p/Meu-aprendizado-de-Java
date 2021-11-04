package br.com.casadocodigo.livraria;

public class Autor {
	String nome;
	String cpf;
	String email;
	
	@Override
	public String toString() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Email: " + this.email);
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor) obj; 
		return this.nome.equals(outro.nome);
	}

}
