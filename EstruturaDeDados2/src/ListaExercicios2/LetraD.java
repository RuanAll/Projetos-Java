package ListaExercicios2;

import java.util.Scanner;

public class LetraD {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
	
		int x, i;
				
		System.out.println("Digite um nmr: ");
		x = ler.nextInt();	
		
		for (i=0; i<=x; i++) {
			System.out.println(i);
		}
	}	
}
