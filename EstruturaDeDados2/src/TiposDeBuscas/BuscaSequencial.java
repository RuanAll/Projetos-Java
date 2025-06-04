
/**A busca sequencial � a t�cnica mais simples de realizar uma busca em uma lista de dados
desordenados. Ela visa procurar o valor atrav�s de compara��es sucessivas a partir do 
primeiro elemento (ou �ltimo) at� que se encontre o valor desejado ou at� que os elementos
da estrutura se esgotem. Pode-se utilizar vetor, lista encadeada ou arquivo bin�rio como 
estrutura de dados.

Dado um vetor: [8, 5, 1, 7, 6]

1- Percorre os elementos de um vetor
2- Se o elemento procurado estiver dentro do vetor, imprime o valor do elemento e para 
de procurar pelo elemento no vetor.
3- Se n�o encontrou o elemento dentro do vetor, imprime uma mensagem informando que o 
elemento n�o foi encontrado.**/

package TiposDeBuscas;                                                                     
                                                                                           
import java.util.Scanner;                                                                  
                                                                                           
public class BuscaSequencial {                                                             
	public static void main(String[]args) {                                             
		Scanner ler = new Scanner (System.in);                                      
		                                                                            
		int vet[] = {8, 5, 1, 7, 6};                                                
		int valor;                                                                  
		boolean encontraValor = false;                                              
		                                                                            
		System.out.println("Digite o valor a ser encontrado:");                     
		valor = ler.nextInt();                                                      
			                                                                    
		int i=0;                                                                    
		                                                                            
		while(i<vet.length && encontraValor == false) {                             
			if(vet[i] == valor)                                                 
				encontraValor = true;                                       
			 i++;                                                               
		}                                                                           
		if(encontraValor == false)                                                  
			System.out.println("Valor Informado n�o encontrado");               
		                                                                            
		else                                                                        
			System.out.println("Valor Encontrado na Posi��o: " +i);             	
	}                                                                                   
}