package pe�as;

import java.util.Scanner;

public class Pe�as {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Porcentagem do IPI a ser acrescido no valor da pe�a: ");
		float ipi = ler.nextInt();
		
		System.out.print("O c�digo da pe�a 1: ");
		int cod = ler.nextInt();
		System.out.print("Valor unit�rio da pe�a 1: ");
		float v1 = ler.nextInt();
		System.out.print("quantidade de pe�as 1: ");
		int qnt1 = ler.nextInt();
		
		System.out.println("\n");

		System.out.print("O c�digo da pe�a 2: ");
		int cod2 = ler.nextInt();
		System.out.print("Valor unit�rio da pe�a 2: ");
		float v2 = ler.nextInt();
		System.out.print("quantidade de pe�as 2: ");
		int qnt2 = ler.nextInt();
		
		float total = (v1 * qnt1 + v2 * qnt2) * ( ipi/100 + 1);

		System.out.println("total a ser pago " + total);
	}
}
