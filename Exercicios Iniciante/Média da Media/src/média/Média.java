package média;

import java.util.Scanner;

public class Média {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int med = (9 + 8 + 7)/3;
		
		System.out.println("A primeira média é: " + med + "\n");
		
		int med2 = (4+5+6)/3;
		
		System.out.println("A segunda média é: " + med2 + "\n");
		
		int soma = med + med2;
		System.out.println("A soma das 2 médias é: " + soma + "\n");
		
		int medmed = soma/2;
		System.out.println("A média das médias é: " + medmed + "\n");
		
	}
}
