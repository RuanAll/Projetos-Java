package view;

import java.util.Scanner;

import model.Usuario;

public class CadastroLogin {

	public void cadastroUser() {
		Scanner ler = new Scanner (System.in);
	
		Usuario cadastroUsuario = new Usuario();
		
		System.out.println("*************** C A D A S T R O ***************");
		
		System.out.print("Username: ");
		String username = ler.next();
		System.out.print("Password: ");
		String password = ler.next();
	
		System.out.println("*** C A D A S T R A D O  C O M  S U C E S S O ***\n\n");
	
		MenuView MenuView = new MenuView();
		MenuView.menu();
}
}