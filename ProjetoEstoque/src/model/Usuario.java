package model;

public class Usuario {

	private int id;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() { //CORRIGIDO
		String retorno = "ID: " + Integer.toString(getId()) + "\n"  + "Username: " + getUsername() + "\n" + "Password: " + getPassword() + "\n";
		return retorno;
	}
}

