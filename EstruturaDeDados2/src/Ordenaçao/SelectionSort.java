package Ordenaçao;

public class SelectionSort {
	public static void main(String[] args) {
		int[] vet = new int [5];
		int i, j, men, aux;
		
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
		
		
// ============ ORDENA O VETOR POR SELECTION SORT ============== //
		for (i=0; i<vet.length; i++) {
			j = i+1;
			men = i;
			while (j<vet.length) { 
				if(vet[j] < vet[men]) 
					men = j;
				j++;
			}
			aux = vet[men];
			vet[men] = vet[i];
			vet[i] = aux;
		}
//---------------------------------------------------------------//	
		
		
		System.out.println("\nVetor Ordenado:");
		
		for (i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = " + vet[i]);
		}		
	}
}
