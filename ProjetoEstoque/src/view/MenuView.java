package view;

import java.util.Scanner;

public class MenuView {
//================================================================================================================//
	public void menu() {
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" _______________________________");
		System.out.println("|___________ M E N U ___________|");
		System.out.println("|                               |");
		System.out.println("| [1] Menu Usuarios             |");
		System.out.println("| [2] Menu Fornecedorres        |");
		System.out.println("| [3] Menu Clientes             |");
		System.out.println("| [4] Menu Produto              |");
		System.out.println("| [5] Menu Tipo Pessoa          |");
		System.out.println("| [6] Menu Tipo Produto         |");
		System.out.println("| [0] Sair                      |");
		System.out.println("|_______________________________|");
		System.out.println("\nDigite oque deseja fazer: ");
		int cod = ler.nextInt();
	
	
		switch(cod) {
		case 0:
			System.exit(0);
			break;
		case 1:
			UsuarioView menuU = new UsuarioView();
			menuU.menuUsuario();
			break;
		case 2:
			FornecedorView menuF = new FornecedorView();
			menuF.menuFornecedor();
			break;
		case 3:
			ClienteView menuC = new ClienteView();
			menuC.menuCliente();
			break;
		case 4:
			ProdutoView menuP = new ProdutoView();
			menuP.menuProduto(null);
			break;
		case 5:
			TipoProdutoView menuTP = new TipoProdutoView();
			menuTP.menuTipoProduto(null);
			break;
		case 6:
			TipoPessoaView menuTPe = new TipoPessoaView();
			menuTPe.menuTipoPessoa(null);
			break;
		default:
			System.out.println("Opção Inválida! Tente Novamente...\n\n");
			menu();
			break;
		}
	}
//================================================================================================================//
}
