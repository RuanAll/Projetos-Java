package model;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String genero;
	private String end;
	private String tel;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() { //CORRIGIDO
		String retorno = "ID: " + Integer.toString(getId()) + "\n"  + "Nome: " + getNome() + "\n" + "Cpf: " + getCpf() + "\n"  + "Genero: " + getGenero() + "\n" + "Endereço: " + getEnd() + "\n" + "Telefone: " + getTel() + "\n";
		return retorno;
	}
	
}