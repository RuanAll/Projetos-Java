package heran�a;

import java.util.Scanner;

public class Horista extends Professor {
	private double valorHora;
	int horas;
	
// ============= Gets e Sets ============= //
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

// ============= M�todo ============= //
	public void calcSalario() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de horas trabalhada: ");
		int horas = ler.nextInt();
		System.out.println("Digite o valor cobrado por hora: ");
		valorHora = ler.nextDouble();
		
		double vh = valorHora * horas;
		setSalario(vh - imposto);
		
		System.out.println("Seu sal�rio como Horista � de: "+getSalario());
	}

	
}
