package Zteste;

public class Contato {									// Classe Contato
	int codigo;											// C�digo do contato
	String nome;										// Nome do contato
	String telefone;									// Telefone do contato

	Contato(int codigo, String nome, String telefone) {	// Construtor com par�metros
	this.codigo = codigo;								// Inicializa o atributo codigo
	this.nome = nome;									// Inicializa o atributo nome
	this.telefone = telefone;							// Inicializa o atributo telefone
	}

	public String toString() {							// Sobrescreve o metodo toString
	return "(" + codigo + ", " + nome + ")";			// REtorna o c�digo e o nome
	}
};
