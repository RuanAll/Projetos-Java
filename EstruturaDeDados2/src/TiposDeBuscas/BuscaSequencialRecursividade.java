package TiposDeBuscas;

public class BuscaSequencialRecursividade {
	public static void main(String[]args) {
		int vet[] = {4,3,5,1,2};
		int elem = 1;
		boolean resp = buscaSeq(vet, elem);
		int i;
		
		for (i=0; i<vet.length; i++) { 
			System.out.println("vet["+i+"] = " + vet[i]);
		}
		
		if(resp == false)
			System.out.println("Elemento não encontrado!");
		else
			System.out.println("Elemento encontrado: " +elem);
	}

	public static boolean buscaRecursiva(int[] vet, int elem, int i) {
		boolean resp = false;
		if(i < vet.length) {
			if(vet[i] == elem)
				resp = true;
			else
				resp = buscaRecursiva(vet, elem, i+1);
		}
	return resp;	
	}
	
	public static boolean buscaSeq(int[] vet, int elem) {
		return buscaRecursiva(vet, elem, 0);
	}
}
