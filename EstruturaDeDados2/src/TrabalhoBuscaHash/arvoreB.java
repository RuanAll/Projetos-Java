package TrabalhoBuscaHash;

import javax.swing.tree.TreeNode;

public class arvoreB {

	private TreeNode raiz;
	
	public TreeNode getRaiz() {
		return raiz;
	}
	
	public void adicionar(User dado) throws Exception {
		if(isVazia()) 
			raiz = new TreeNode(dado);
		else
			inserirRecursivo(raiz, dado);
	}
	
	
	private User buscar(TreeNode raizSub, int id) throws Exception {
		if(raizSub == null)
			throw new Exception("[ERROR] Valor não Encontrado!");
		else if(id == raizSub.getDado().getId())
			return raizSub.getDado();
		else if(id < raizSub.getDado().getId())
			return buscar(raizSub.getEsq(),id);
		else
			return buscar(raizSub.getDir(), id);
	}
	public void EnOrdem() {
		// TODO Auto-generated method stub
		
	}
}
