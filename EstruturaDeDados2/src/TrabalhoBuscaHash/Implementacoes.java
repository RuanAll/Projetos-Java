package TrabalhoBuscaHash;

import ArvoreBinariaBusca.arvoreB;

public class Implementacoes implements Projeto {

	private arvoreB[] tabela;
	private int qnt;
	
	public Implementacoes(int tamanho) {
		tabela = new Arvore[tamanho];
	}
	
	public int hash(int id) {
		return id % tabela.length;
	}
	
	@Override
	public void adicionar(User u) throws Exception{
		int valorhash = hash(u.getId());
		if(tabela[valorhash] == null)
			tabela[valorhash] = new arvoreB();
		
		tabela[valorhash].inserir(u);
		qnt++;
	}
	
	@Override
	public User buscar(int id) throws Exception{
		int valorhash = hash(id);
		if(tabela[valorhash] != null)
			return tabela[valorhash].buscar(id);
			
		throws new Exception("[ERRO] User não encontrado!");
	}

	@Override
	public void imprimir() {
		for(int i=0; i< tabela.length; i++) {
			if(tabela[i] != null) {
				try {
					System.out.println("[" + i + "] - Raiz -> ");
					tabela[i].PreOrdem();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();
			}
		}
	}
	
	public int quantidade() {
		return qnt;
	}

	@Override
	public int has(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
