package model;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("ESCOLHA A OP��O DE PAGAMENTO");
		System.out.println("[1] Pagamento � Vista");
		System.out.println("[2] Pagamento � Prazo");
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
			System.out.println("Op��o n�o encontrada!");
			break;
		}
	}
}
