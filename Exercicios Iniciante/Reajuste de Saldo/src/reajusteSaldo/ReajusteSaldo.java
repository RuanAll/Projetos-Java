package reajusteSaldo;

import java.util.Scanner;

public class ReajusteSaldo {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o Saldo a ser reajustado: ");
		float saldo = ler.nextFloat();		
		
		float reajuste = (float) (saldo + saldo * 0.01); 
		
		System.out.println(reajuste);
	}
}
