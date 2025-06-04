package exercicio;

import java.util.Scanner;

public class Corda extends Instrumento {
	
	private int numCorda;
	private String tipo;
	private float precoVenda;
	
	public void calcularPreco() {
		Scanner ler = new Scanner(System.in);
		
		Instrumento instrumento = new Instrumento(); 
		
		System.out.println("=================================");
		System.out.println("Marca: ");
		instrumento.setMarca(ler.next());
		System.out.println("Preço Custo: ");
		instrumento.setPrecoCusto(ler.nextFloat());
		System.out.println("Número de Cordas: ");
		numCorda = ler.nextInt();
		System.out.println("Tipo do Instrumento: ");
		tipo = ler.next();
		System.out.println("=================================\n\n");
		
		if (numCorda > 8) {
			precoVenda = getPrecoCusto() * 5;
		}
		else {
			precoVenda = getPrecoCusto() * 7;
		}
		
		System.out.println("Marca: " + instrumento.getMarca());
		System.out.println("Preço Custo: " +instrumento.getPrecoCusto());
		System.out.println("Número de Cordas: " +numCorda);
		System.out.println("Tipo do Instrumento: " +tipo+ "\n\n");
		System.out.println("Preço de Venda: " +precoVenda);
		
	}
	
}
