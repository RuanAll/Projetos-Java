
/*Este m�todo de pesquisa � muito mais r�pido que a pesquisa sequencial, e usa como base que 
o vetor j� est� ordenado:

Dado um vetor: [0, 2, 4, 6, 8, 10, 12, 14]

Encontra a posi��o referente ao meio do vetor, e verifica se o valor procurado � o elemento 
do meio do vetor. Se encontrou o valor:

1- imprime uma mensagem de confirma��o. Se n�o encontrou o valor:
2- Se o valor procurado � menor que o valor que est� no meio do vetor, a posi��o final do vetor 
ser� uma posi��o antes do meio do vetor.
3- Se o valor procurado � maior que o valor que est� no meio do vetor, a posi��o inicial do vetor 
ser� uma posi��o depois do meio do vetor.
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
				System.out.println("Valor Informado n�o encontrado");
	}
}
