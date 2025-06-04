package Ordenaçao;

public class QuickSort {
	public static void main(String[] args) {
		int[] vet = new int [5];

		
		System.out.println("Vetor Randomizado:");
		
// ========== PREENCHE O VETOR COM NUMEROS ALEATÓRIOS ========== //
		for (int i=0; i< vet.length; i++) {
			vet[i] = (int) (Math.random()*vet.length);
  		}
//---------------------------------------------------------------//
 
		
// ================ IMPRIME O VETOR RANDOMIZADO ================ //		
		for (int i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = "+vet[i]);
		}
//---------------------------------------------------------------//	
		
		
// ====================== CHAMA O METODO ======================= //	
		quicksort(vet, 0 , vet.length - 1);
//---------------------------------------------------------------//	
	
		
// ================= IMPRIME O VETOR ORDENADO ================== //	
		System.out.println("\nVetor Ordenado:");
					
		for (int i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = " + vet[i]);
		}	
//---------------------------------------------------------------//	
	}
	
		
// ============== ORDENA O VETOR POR QUICK SORT ================ //
		static void quicksort (int[] vet, int esq, int dir) {
			if (esq < dir) { 
				int p = particao(vet, esq, dir);
				quicksort(vet, esq, p);
				quicksort(vet, p + 1, dir);
			}
		}
		
		static int particao (int[] vet, int esq, int dir) {
			int meio = (int) (esq+dir)/2;
			int pivo = vet[meio];
			int i = esq - 1;
			int j = dir + 1;
			
			while(true) {
				do {
					i++;
				}while(vet[i] < pivo);
				do {
					j--;
				}while(vet[j] > pivo);
				if (i >= j)
					return j;
				int aux = vet[i];
				vet[i] = vet[j];
				vet[j] = aux;
			}
		}
//---------------------------------------------------------------//	
		
}


