package m�dia;

import java.util.Scanner;

public class M�dia {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int med = (9 + 8 + 7)/3;
		
		System.out.println("A primeira m�dia �: " + med + "\n");
		
		int med2 = (4+5+6)/3;
		
		System.out.println("A segunda m�dia �: " + med2 + "\n");
		
		int soma = med + med2;
		System.out.println("A soma das 2 m�dias �: " + soma + "\n");
		
		int medmed = soma/2;
		System.out.println("A m�dia das m�dias �: " + medmed + "\n");
		
	}
}
