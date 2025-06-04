package view;

import java.util.Scanner;
import model.TipoProduto;

public class TipoProdutoView {
//================================================================================================================//
	public void menuTipoProduto(TipoProduto tipoP) {
		Scanner ler = new Scanner (System.in);
				
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|_________ M E N U  T I P O  P R O D U T O _________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar Categoria                           |");
		System.out.println("| [2] Listar Categorias dos Produtos                |");
		System.out.println("| [3] Atualizar Categorias                          |");
		System.out.println("| [4] Deletar Categorias                            |");
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
				listar(tipoP);
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
			
		TipoProduto cadastroTipoProduto = new TipoProduto();
			
		System.out.println("*** C A D A S T R O  D E  C A T E G O R I A S ***");
		System.out.println("Informe o ID: ");
		cadastroTipoProduto.setId(ler.nextInt());
		System.out.println("Informe a Categoria do Produto: ");
		cadastroTipoProduto.setDesc(ler.next());
			
		System.out.println("*** C A D A S T R O  R E A L I Z A D O ***\n\n");
		menuTipoProduto(cadastroTipoProduto);
	}	
//================================================================================================================//	
	public void listar(TipoProduto tipoP1) {
		Scanner ler = new Scanner (System.in);
				
		TipoProduto listarTipoProduto = new TipoProduto();
				
		System.out.println(" > C A T E G O R I A  C A D A S T R A D A <\n ");
		System.out.println("   ID da Categoria: " + tipoP1.getId());
		System.out.println("   Descrição: " + tipoP1.getDesc());
		System.out.println("------------------------------------");
		System.out.println("  [0] Voltar ");
		int cod = ler.nextInt();
				
		if (cod == 0) {
			menuTipoProduto(listarTipoProduto);
		}			
	}
//================================================================================================================//
}
