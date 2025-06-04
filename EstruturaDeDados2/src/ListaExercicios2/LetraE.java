package ListaExercicios2;

import java.util.Scanner;

public class LetraE {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
	
		int x, i, aux, soma=0;
				
		System.out.println("Digite um nmr: ");
		x = ler.nextInt();	
		
		for (i=0; i<=x; i++) {
			if(i % 2 == 0)
				soma = i + soma;
		}
		System.out.println(soma);
	}	
}
