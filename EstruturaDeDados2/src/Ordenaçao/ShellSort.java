package Ordenaçao;

public class ShellSort {
	public static void main(String[] args) {
		int[] vet = new int [5];
		int i, j, h = 1, tam = vet.length, elem;
		
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
	
		
// ============== ORDENA O VETOR POR SHELL SORT ================ //
		while(h < tam){
			h = h * 3 + 1;
		}
		h = (int) Math.floor(h / 3);
		
		while(h > 0) {
			for( i = h; i < tam; i++) {
				elem = vet[i];
				j=i;
				while(j >= h && vet[j-h] > elem) {
					vet[j] = vet[j-h];
					j = j -h;
				}
				vet[j] = elem;
			}
			h = h/2;
		}
//---------------------------------------------------------------//	
						
				
		System.out.println("\nVetor Ordenado:");
				
		for (i=0;i<vet.length;i++) { 
			System.out.println("vet["+i+"] = " + vet[i]);
		}	
	}
}
