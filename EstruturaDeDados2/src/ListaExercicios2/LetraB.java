package ListaExercicios2;

import java.util.Scanner;

public class LetraB {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
	
		int x, y, rest;
				
		System.out.println("Digite um nmr: ");
		x = ler.nextInt();		
				
		System.out.println("Digite outro nmr: ");
		y = ler.nextInt();	
		
		rest = x%y;
		
		System.out.println("o resto da divisão é: " +rest);
			
	}
}
