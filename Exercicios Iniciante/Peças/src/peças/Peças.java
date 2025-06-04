package peças;

import java.util.Scanner;

public class Peças {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Porcentagem do IPI a ser acrescido no valor da peça: ");
		float ipi = ler.nextInt();
		
		System.out.print("O código da peça 1: ");
		int cod = ler.nextInt();
		System.out.print("Valor unitário da peça 1: ");
		float v1 = ler.nextInt();
		System.out.print("quantidade de peças 1: ");
		int qnt1 = ler.nextInt();
		
		System.out.println("\n");

		System.out.print("O código da peça 2: ");
		int cod2 = ler.nextInt();
		System.out.print("Valor unitário da peça 2: ");
		float v2 = ler.nextInt();
		System.out.print("quantidade de peças 2: ");
		int qnt2 = ler.nextInt();
		
		float total = (v1 * qnt1 + v2 * qnt2) * ( ipi/100 + 1);

		System.out.println("total a ser pago " + total);
	}
}
