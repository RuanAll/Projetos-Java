package ArvoreBinariaBusca;

public class main {
	public static void main(String[] args) {
	
		arvoreB arvore = new arvoreB(10);
		arvoreB.montaArvore(arvore, null);
		
		arvoreB n5 = new arvoreB(5);
		arvoreB.montaArvore(n5, arvore);
		arvoreB n2 = new arvoreB(2);
		arvoreB.montaArvore(n2, arvore);
		arvoreB n8 = new arvoreB(8);
		arvoreB.montaArvore(n8, arvore);
		arvoreB n1 = new arvoreB(1);
		arvoreB.montaArvore(n1, arvore);
		
		System.out.println("Arvore Em Ordem");
		arvoreB.imprimirEmOrdem(arvore);
		
		
		arvoreB.buscaNo(arvore, 11);
	}
}
