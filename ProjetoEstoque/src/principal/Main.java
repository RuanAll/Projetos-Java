package principal;

import java.util.Scanner;

import view.LoginView;
import view.MenuView;

public class Main {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		LoginView log = new LoginView();
		System.out.println(" _______________________________");
		System.out.println("|___________ M E N U ___________|");
		System.out.println("|                               |");
		System.out.println("| [1] Fazer Login               |");
		System.out.println("| [2] Fazer Cadastro            |");
		System.out.println("|                               |");
		System.out.println("| [0] Sair                      |");
		System.out.println("|_______________________________|");
		System.out.println("\nDigite oque deseja fazer: ");
		
		int cod = ler.nextInt();
		
		switch(cod) {
		case 1:
			log.loginUser();
			break;
		case 2:
			
			break;
		default:
			System.exit(0);
			break;
		}
	}
}
