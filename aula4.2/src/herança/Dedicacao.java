package heran�a;

import java.util.Scanner;

public class Dedicacao extends Professor {
	private float salarioBase;
	double imposto;

// ============= Gets e Sets ============= //
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
// ============= M�todo ============= //
	void calcImposto() {
		imposto = getSalario() * 0.25;
	}
	void calcSalario(){
		setSalario(getSalario() - imposto);
		
		
	}
	
}
