package TrabalhoBuscaHash;

public interface Projeto {

	public int has(int id);
	
	public void adicionar(User u) throws Exception;
	
	public User buscar(int id) throws Exception;
	
	public void imprimir();
	
	public int quantidade();
}
