package model;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ESCOLHA A OPÇÃO DE PAGAMENTO");
		System.out.println("[1] Pagamento à Vista");
		System.out.println("[2] Pagamento à Prazo");
		int cod = ler.nextInt();
		
		switch(cod) {
		case 1:
			Vista vista = new Vista ();
			vista.juros();
			break;
		case 2:
			Prazo prazo = new Prazo();
			prazo.pagamento();
			break;
		default:
			System.out.println("Opção não encontrada!");
			break;
		}
	}
}
