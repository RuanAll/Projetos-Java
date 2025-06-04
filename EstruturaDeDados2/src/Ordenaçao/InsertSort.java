package Ordenaçao;

public class InsertSort {
	public static void main(String[] args) {
		int[] vet = new int [5];
		int i, j, ref;
		
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
		
		
// ============== ORDENA O VETOR POR INSERT SORT =============== //
		for (i=1; i<vet.length; i++) {
			ref = vet[i];
			j = i-1;
			while (j>=0 && vet[j] > ref) {
					vet[j+1] = vet[j];
				j--;
			}
			vet[j+1] = ref;
		}
//---------------------------------------------------------------//
		
		
		System.out.println("\nVetor Ordenado:");
		
		for (i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = " + vet[i]);
		}
	}
}
