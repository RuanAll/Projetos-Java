package herança;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
	Scanner ler = new Scanner(System.in);
		
	Professor professor = new Professor();
	System.out.println("Digite seu nome: ");
	professor.setNome(ler.next());
	//System.out.println("Digite o seu salário: ");
	//professor.setSalario(ler.nextDouble());
	
	System.out.println("Digite [1] se você é um professor Horista");
	System.out.println("Digite [2] se você é um professor Dedicação");
	System.out.println("Digite a opção que reflete o seu trabalho: ");
	int cod = ler.nextInt();

	switch(cod) {
	case 1:
		Horista horista = new Horista();
		horista.calcSalario();
		
			
		break;
		
	case 2:
		
		
		break;
	}
		
	}
}
