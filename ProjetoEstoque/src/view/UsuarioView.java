package view;

import model.Usuario;
import java.util.ArrayList;
import java.util.Scanner;
import controller.UsuarioController;

/*
Professor foi seguido os passos passado por vc no 3° vídeo, porém feito os passos o programa nao
roda como deveria, o listar não lista como deveria, o contador de Id nao funciona corretamente, e eu
não consegui ajustar esses erros;
Portanto tirei a parte onde é feito o refatoramento do codigo.
*/

public class UsuarioView {
//================================================================================================================//
	public void menuUsuario() { //CORRIGIDO
			Scanner ler = new Scanner (System.in);
		
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|___________ M E N U  D O  U S U Á R I O ___________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar                                     |");
		System.out.println("| [2] Listar Todos os Usuários                      |");
		System.out.println("| [3] Atualizar Usuário                             |");
		System.out.println("| [4] Deletar Usuário                               |");
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
			System.out.println("Opção Inválida! Tente Novamente...\n\n");
			menuUsuario();
			break;
		}
	}	
//================================================================================================================//
	public void cadastro() { //CORRIGIDO	
		Scanner ler = new Scanner (System.in);
		
	 	Usuario cadastroUsuario = new Usuario();
		
		System.out.println("***** C A D A S T R O  D E  U S U Á R I O *****");
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
			System.out.println("Não possuí Usuário Cadastrado!");
		else {			
			System.out.println("> U S U Á R I O S  C A D A S T R A D O S < ");
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
			System.out.println("Opção Inválida!");
			listar();
		}
	}
//================================================================================================================//
	public void atualizar() { //CORRIGIDO
		Scanner ler = new Scanner(System.in);
		Usuario user = new Usuario();
	
		System.out.println("=== Atualização de Usuário ===\n");
		System.out.println("Informe o Username: ");
		user.setUsername(ler.next());
		System.out.println("Informe o novo Password: ");
		user.setPassword(ler.next());
		
		System.out.println("------------------------------");
	
		UsuarioController userControll = new UsuarioController();
		if (!userControll.atualizar(user))
			System.out.println("Usuário não Encontrado!");
		else
			System.out.println("Usuário Atualizado!!!");
		
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			menuUsuario();
		default:
			System.out.println("Opção Inválida!");
			atualizar();
		}
	}
//================================================================================================================//
	public void deletar() { //CORRIGIDO	
		Scanner ler = new Scanner(System.in);
		Usuario user = new Usuario();
		
		System.out.println("=== Deletar Usuário ===\n");
		System.out.println("Informe o Username: ");
		user.setUsername(ler.next());
			
		UsuarioController userControll = new UsuarioController();
		
		if(!userControll.deletar(user)) {
			System.out.println("-----------------------------");
			System.out.println("-- Usuário não encontrado! --");
			System.out.println("-----------------------------");
		} else {
			System.out.println("-----------------------");
			System.out.println("-- Usuário Deletado! --");
			System.out.println("-----------------------");
		}
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
				
		switch(cod) {
		case 0:
			menuUsuario();
		default:
			System.out.println("Opção Inválida!");
			deletar();
		}
	}
//================================================================================================================//
}
