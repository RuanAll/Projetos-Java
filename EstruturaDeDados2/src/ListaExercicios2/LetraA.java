package ListaExercicios2;

import java.util.Scanner;

public class LetraA {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int x, y, tot;
		
		System.out.println("Digite um nmr: ");
		x = ler.nextInt();
		
		System.out.println("Digite outro nmr: ");
		y = ler.nextInt();
		
		tot = x*y;
		
		System.out.println("o Total da multiplicação é: " +tot);
	}	
}

