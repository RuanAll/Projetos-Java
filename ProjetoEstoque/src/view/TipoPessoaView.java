package view;

import java.util.Scanner;

import model.TipoPessoa;
import model.Usuario;

public class TipoPessoaView {
	
//================================================================================================================//
	public void menuTipoPessoa(TipoPessoa tipoPe) {
		Scanner ler = new Scanner (System.in);
			
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|__________ M E N U  T I P O  P E S S O A __________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar Tipo Pessoa                         |");
		System.out.println("| [2] Listar Todos os Tipo Pessoa                   |");
		System.out.println("| [3] Atualizar Tipo Pessoa                         |");
		System.out.println("| [4] Deletar Tipo Pessoa                           |");
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
			menuCadastro();
			break;
		case 2:
			listar(tipoPe);
			break;
		case 3:
				
			break;
		case 4:
			
			break;
		}
	}	
//================================================================================================================//
	public void menuCadastro() {
		Scanner ler = new Scanner (System.in);
		
		TipoPessoa cadastroTipoPessoa = new TipoPessoa();
		
		System.out.println("*** C A D A S T R O  D E  T I P O  P E S S O A ***");
		System.out.println("Informe o ID: ");
		cadastroTipoPessoa.setId(ler.nextInt());
		System.out.println("Informe qual o tipo Pessoa: ");
		cadastroTipoPessoa.setDesc(ler.next());
		
		System.out.println("*** C A D A S T R O  R E A L I Z A D O ***\n\n");
		menuTipoPessoa(cadastroTipoPessoa);
	}
//================================================================================================================//
	public void listar(TipoPessoa tipoPe1) {
		Scanner ler = new Scanner (System.in);
			
		TipoPessoa listarTipoPessoa = new TipoPessoa();
			
		System.out.println(" > T I P O  P E S S O A  C A D A S T R A D O S <\\n ");
		System.out.println("   ID: " + tipoPe1.getId());
		System.out.println("   Descrição: " + tipoPe1.getDesc());
		System.out.println("   --------------------------------");
		System.out.println("  [0] Voltar ");
		int cod = ler.nextInt();
			
		if (cod == 0) {
			menuTipoPessoa(listarTipoPessoa);
		}
	}
//================================================================================================================//
}
