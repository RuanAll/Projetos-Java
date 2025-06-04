package model;

import java.util.Scanner;

public class Vista extends Pagamento {

	double desc;
	
	void juros () {
		Scanner ler = new Scanner(System.in);
		
		Pagamento pagamento = new Pagamento ();
		
		System.out.println("Digite o valor a ser pago: ");
		pagamento.setValor(ler.nextInt());
		System.out.println("Digite a porcentagem do desconto: ");
		desc = ler.nextDouble();
		
		double valorFinal = pagamento.valor - ( pagamento.valor * (desc/100));
		
		System.out.println("O valor do pagamento a Vista é de R$ " + valorFinal);
	}
	
}
