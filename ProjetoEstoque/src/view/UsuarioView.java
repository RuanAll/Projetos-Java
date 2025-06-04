package view;

import model.Usuario;
import java.util.ArrayList;
import java.util.Scanner;
import controller.UsuarioController;

/*
Professor foi seguido os passos passado por vc no 3� v�deo, por�m feito os passos o programa nao
roda como deveria, o listar n�o lista como deveria, o contador de Id nao funciona corretamente, e eu
n�o consegui ajustar esses erros;
Portanto tirei a parte onde � feito o refatoramento do codigo.
*/

public class UsuarioView {
//================================================================================================================//
	public void menuUsuario() { //CORRIGIDO
			Scanner ler = new Scanner (System.in);
		
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|___________ M E N U  D O  U S U � R I O ___________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar                                     |");
		System.out.println("| [2] Listar Todos os Usu�rios                      |");
		System.out.println("| [3] Atualizar Usu�rio                             |");
		System.out.println("| [4] Deletar Usu�rio                               |");
		System.out.println("| [0] Voltar Para o Menu                            |");
		System.out.println("|___________________________________________________|");
		System.out.println("\nDigite oque deseja fazer: ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			MenuView MenuView = new MenuView();
			MenuView.menu();
			break;
		case 1:
			cadastro();
			break;
		case 2:
			listar();
			break;
		case 3:
			atualizar();
			break;
		case 4:
			deletar();
			break;
		default:
			System.out.println("Op��o Inv�lida! Tente Novamente...\n\n");
			menuUsuario();
			break;
		}
	}	
//================================================================================================================//
	public void cadastro() { //CORRIGIDO	
		Scanner ler = new Scanner (System.in);
		
	 	Usuario cadastroUsuario = new Usuario();
		
		System.out.println("***** C A D A S T R O  D E  U S U � R I O *****");
		System.out.println("Informe o Login: ");
		cadastroUsuario.setUsername(ler.next());
		System.out.println("Informe o Password: ");
		cadastroUsuario.setPassword(ler.next());
		
		UsuarioController userControll = new UsuarioController();
		
		System.out.println(userControll.cadastrar(cadastroUsuario));
		menuUsuario();
	}
//================================================================================================================//
	public void listar() { //CORRIGIDO
		Scanner ler = new Scanner (System.in);
		
		UsuarioController userControll = new UsuarioController();
		ArrayList<Usuario> userList = userControll.listar();
		
		if(userList.isEmpty()) 
			System.out.println("N�o possu� Usu�rio Cadastrado!");
		else {			
			System.out.println("> U S U � R I O S  C A D A S T R A D O S < ");
			System.out.println("------------------------------------------");
			
			for (int cont = 0; cont < userList.size(); cont++) 
				System.out.println(userList.get(cont).toString());
			
			System.out.println("------------------------------------------");
		}
		
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			menuUsuario();
		default:
			System.out.println("Op��o Inv�lida!");
			listar();
		}
	}
//================================================================================================================//
	public void atualizar() { //CORRIGIDO
		Scanner ler = new Scanner(System.in);
		Usuario user = new Usuario();
	
		System.out.println("=== Atualiza��o de Usu�rio ===\n");
		System.out.println("Informe o Username: ");
		user.setUsername(ler.next());
		System.out.println("Informe o novo Password: ");
		user.setPassword(ler.next());
		
		System.out.println("------------------------------");
	
		UsuarioController userControll = new UsuarioController();
		if (!userControll.atualizar(user))
			System.out.println("Usu�rio n�o Encontrado!");
		else
			System.out.println("Usu�rio Atualizado!!!");
		
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			menuUsuario();
		default:
			System.out.println("Op��o Inv�lida!");
			atualizar();
		}
	}
//================================================================================================================//
	public void deletar() { //CORRIGIDO	
		Scanner ler = new Scanner(System.in);
		Usuario user = new Usuario();
		
		System.out.println("=== Deletar Usu�rio ===\n");
		System.out.println("Informe o Username: ");
		user.setUsername(ler.next());
			
		UsuarioController userControll = new UsuarioController();
		
		if(!userControll.deletar(user)) {
			System.out.println("-----------------------------");
			System.out.println("-- Usu�rio n�o encontrado! --");
			System.out.println("-----------------------------");
		} else {
			System.out.println("-----------------------");
			System.out.println("-- Usu�rio Deletado! --");
			System.out.println("-----------------------");
		}
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
				
		switch(cod) {
		case 0:
			menuUsuario();
		default:
			System.out.println("Op��o Inv�lida!");
			deletar();
		}
	}
//================================================================================================================//
}
