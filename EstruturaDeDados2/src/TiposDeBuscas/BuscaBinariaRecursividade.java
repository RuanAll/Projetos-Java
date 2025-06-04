package TiposDeBuscas;

public class BuscaBinariaRecursividade {
	public static void main(String[]args) {
		int vet[] = {1,2,3,4,5};
		int elem = 1;
		int resp = buscaBinariaRec(vet, elem);
		
		for (int i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = "+vet[i]);
		}
		
		if(resp < 0)
			System.out.println("Elemento não encontrado!");
		else
			System.out.println("Elemento encontrado no indice: " + resp);
	}
	
	public static int buscaBinariaRec(int[] vet, int elem) {
		return buscaRecursiva(vet, elem, 0, vet.length - 1);
	}
	
	public static int buscaRecursiva(int[] vet, int elem, int esq, int dir) {
		int meio = (esq+dir)/2;
		if(esq > dir)
			return -1;
		if(vet[meio] == elem)
			return meio;
		if(vet[meio] < elem)
			return buscaRecursiva(vet, elem, meio +1, dir);
		else
			return buscaRecursiva(vet, elem, esq, meio-1);
	}
	
}
