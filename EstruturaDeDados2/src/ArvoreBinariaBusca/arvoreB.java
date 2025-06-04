package ArvoreBinariaBusca;

public class arvoreB {
	

	private int valor;
	private arvoreB esq;
	private arvoreB dir;
	
	arvoreB (int valor){
		this.valor = valor;
		this.esq = null;
		this.dir = null;
	}
	
	public static void montaArvore(arvoreB novo, arvoreB arvore) {		
		if (arvore == null) 
			arvore = novo;
		else {
			if(novo.valor < arvore.valor) {
				if(arvore.esq == null)
					arvore.esq = novo;
				else
					montaArvore(novo, arvore.esq);
			}
			else {
				if(arvore.dir == null)
					arvore.dir = novo;
				else
					montaArvore(novo, arvore.dir);
			}
		}
	}
	
	public static String buscaNo (arvoreB arvore, int valor) {
		if(arvore == null) 
			System.out.println("-----------------\nValor não encontrado");
		else if (arvore.valor == valor)
				System.out.println("-----------------\nValor encontrado");
		else {
			if(arvore.valor > valor)
				buscaNo(arvore.esq, valor);
			else
				buscaNo(arvore.dir, valor);
		}
		return null;
	}
	
	public static void imprimirEmOrdem(arvoreB n) {
		if(n.esq != null)
			imprimirEmOrdem(n.esq);
		System.out.println(n.valor + " ");
		
		if(n.dir != null)
			imprimirEmOrdem(n.dir);
	}
}
