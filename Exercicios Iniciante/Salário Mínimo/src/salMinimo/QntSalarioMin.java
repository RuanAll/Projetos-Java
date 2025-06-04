package salMinimo;

import java.util.Scanner;

public class QntSalarioMin {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Double salMin = 1212.00;
		
		System.out.print("Digite o valor do seu salário: ");
		Double sal = ler.nextDouble();
		
		int qnt = (int) (sal/salMin);
	
		System.out.println("Vc recebe " + qnt + " Salarior minimos");
		
	}
}
