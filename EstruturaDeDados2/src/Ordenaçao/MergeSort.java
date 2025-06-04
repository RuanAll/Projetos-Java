package Ordenaçao;

public class MergeSort {
	public static void main(String[] args) {
		int[] vet = new int [5];
		int[] vetAux = new int[vet.length];
		int i;
		
		System.out.println("Vetor Randomizado:");
		
// ========== PREENCHE O VETOR COM NUMEROS ALEATÓRIOS ========== //
		for (i=0; i< vet.length; i++) {
			vet[i] = (int) (Math.random()*vet.length);
  		}
//---------------------------------------------------------------//

// ================ IMPRIME O VETOR RANDOMIZADO ================ //		
		for (i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = "+vet[i]);
		}
//---------------------------------------------------------------//
	
// ====================== CHAMA O METODO ======================= //	
		mergeSort(vet, vetAux, 0, vet.length-1);	
//---------------------------------------------------------------//
	
// ================= IMPRIME O VETOR ORDENADO ================== //
		System.out.println("\nVetor Ordenado:");
				
		for (i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = " + vet[i]);
		}	
//---------------------------------------------------------------//

	}

// ============== ORDENA O VETOR POR MERGE SORT ================ //
	static void mergeSort(int[] vet, int[] vetAux, int ini, int fim) {
		if(ini < fim) {
			int meio = (ini+fim)/2;
			mergeSort(vet, vetAux, ini, meio);
			mergeSort(vet, vetAux, meio + 1, fim);
			intercalar(vet, vetAux, ini, meio, fim);
		}
	}		
	
	static void intercalar(int[] vet, int[] vetAux, int ini, int meio, int fim) {
		for(int i = ini; i <= fim; i++) {
			vetAux[i] = vet[i];
		}
		
		int esq = ini;
		int dir = meio + 1;
		
		for(int i = ini; i <= fim; i++) {
			if(esq > meio)
				vet[i] = vetAux[dir++];
			else if(dir > fim)
				vet[i] = vetAux[esq++];
			else if(vetAux[esq] < vetAux[dir])
				vet[i] = vetAux[esq++];
    			else
				vet[i] = vetAux[dir++];
		}
	}
//---------------------------------------------------------------//
	
}