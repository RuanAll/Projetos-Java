import java.util.Scanner;

public class antSus {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um nmr: ");
		int num = ler.nextInt();
		
		int ant = num-1;
		int sus = num +1;
		
		System.out.println("seu nmr: " +num);
		System.out.println("seu antecessor: " +ant);
		System.out.println("seu sucessor: " +sus);
		
	}
}
