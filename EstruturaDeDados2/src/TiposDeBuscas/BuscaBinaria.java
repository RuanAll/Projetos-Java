
/*Este método de pesquisa é muito mais rápido que a pesquisa sequencial, e usa como base que 
o vetor já está ordenado:

Dado um vetor: [0, 2, 4, 6, 8, 10, 12, 14]

Encontra a posição referente ao meio do vetor, e verifica se o valor procurado é o elemento 
do meio do vetor. Se encontrou o valor:

1- imprime uma mensagem de confirmação. Se não encontrou o valor:
2- Se o valor procurado é menor que o valor que está no meio do vetor, a posição final do vetor 
será uma posição antes do meio do vetor.
3- Se o valor procurado é maior que o valor que está no meio do vetor, a posição inicial do vetor 
será uma posição depois do meio do vetor.
4- Volta para o passo 1.

____________________________________________________________________________________________*/
package TiposDeBuscas;

import java.util.Scanner;

public class BuscaBinaria {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int[] vet = new int [8];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = i*2;
			System.out.println("vet["+i+"] = "+vet[i]);
		}
			System.out.println("\nDigite o numero a ser achado: ");
			int achado = ler.nextInt();
			
			boolean achou = false;
			int ini = 0;
			int fim = vet.length;
			int meio;
			
			while(ini <= fim) {
				meio = (ini+fim)/2;
				if(vet[meio] == achado) {
					achou = true;
					break;
				}
				else if (vet[meio] < achado)
					ini = meio + 1;
				else
					fim = meio - 1;
			}
			if(achou == true)
				System.out.println("Valor Encontrado");
			else
				System.out.println("Valor Informado nâo encontrado");
	}
}
