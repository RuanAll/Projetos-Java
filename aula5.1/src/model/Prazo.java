package model;

import java.util.Scanner;

public class Prazo extends Pagamento {
	
	private int taxa;
	private int meses;
	
	public void pagamento() {
		Scanner ler = new Scanner (System.in);
		
		Pagamento pagamento = new Pagamento();
		
		System.out.println("Digite o valor a ser pago: ");
		pagamento.setValor(ler.nextInt());
		System.out.println("Digite o valor da taxa de juros por m�s: ");
		taxa = ler.nextInt();
		System.out.println("Digite com quantos meses ser� feito o pagamento: ");
		meses = ler.nextInt();
		
		double juros = (pagamento.valor * meses * (taxa/100));
		
		System.out.println("O valor do juros � de R$ "+ juros);
		System.out.println("O valor do pagamento a prazo � de R$");
	}
}
