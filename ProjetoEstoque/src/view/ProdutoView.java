package view;

import java.util.Scanner;

import model.Produto;
import model.Usuario;

public class ProdutoView {
//================================================================================================================//
	public void menuProduto(Produto prod) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\n __________________________________________________ ");
		System.out.println("|____________ M E N U  P R O D U T O S ____________|");
		System.out.println("|                                                  |");
		System.out.println("| [1] Cadastrar Produto                            |");
		System.out.println("| [2] Listar Todos os Produtos                     |");
		System.out.println("| [3] Atualizar Produtos                           |");
		System.out.println("| [4] Deletar Produto                              |");
		System.out.println("| [0] Voltar Para o Menu                           |");
		System.out.println("|__________________________________________________|");
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
			listar(prod);
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
		
		Produto menuCadastro = new Produto();
		
		System.out.println("*** C A D A S T R O  D E  P R O D U T O ***");
		System.out.println("Informe o Código: ");
		menuCadastro.setCod(ler.nextInt());
		System.out.println("Informe a Descrição: ");
		menuCadastro.setDesc(ler.next());
		System.out.println("Informe a Marca: ");
		menuCadastro.setMarca(ler.next());
		System.out.println("Imforme o Preço de Compra: ");
		menuCadastro.setPrecoComp(ler.nextFloat());
		System.out.println("Informe o Preço de Venda: ");
		menuCadastro.setPrecoVend(ler.nextFloat());
		System.out.println("Informe a Data de Validade: ");
		menuCadastro.setDataValidade(ler.next());
		System.out.println("Informe o Tipo do Produto: ");
		menuCadastro.setTipoProduto(ler.nextInt());
		System.out.println("Informe a Cor: ");
		menuCadastro.setCor(ler.next());
		System.out.println("Informe a Quantidade: ");
		menuCadastro.setUnidade(ler.nextInt());
		
		System.out.println("*** C A D A S T R O  R E A L I Z A D O ***\n\n");
		menuProduto(menuCadastro);
	}
//================================================================================================================//
	public void listar(Produto prod1) {
		Scanner ler = new Scanner (System.in);
		
		Produto listarProduto = new Produto();
		
		System.out.println(" > P R O D U T O S  C A D A S T R A D O S <\\n ");
		System.out.println("   Código............. " + prod1.getCod());
		System.out.println("   Descrição.......... " + prod1.getDesc());
		System.out.println("   Marca.............. " + prod1.getMarca());
		System.out.println("   Preço de Compra.... R$" + prod1.getPrecoComp());
		System.out.println("   Preço de Venda..... R$" + prod1.getPrecoVend());
		System.out.println("   Data de Validade... " + prod1.getDataValidade());
		System.out.println("   Tipo do Produto.... " + prod1.getTipoProtudo());
		System.out.println("   Cor................ " + prod1.getCor());
		System.out.println("   Unidade............ " + prod1.getUnidade());
		System.out.println("   --------------------------------");
		System.out.println("  [0] Voltar ");
		int cod = ler.nextInt();
		
		if (cod == 0) {
			menuProduto(listarProduto);
		}
	}
}
