package view;

import java.util.ArrayList;
import java.util.Scanner;
import controller.FornecedorController;
import model.Fornecedor;

public class FornecedorView {
//================================================================================================================//
	public void menuFornecedor() {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|________ M E N U  D O  F O R N E C E D O R ________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar Fornecedor                          |");
		System.out.println("| [2] Listar Todos os Fornecedores                  |");
		System.out.println("| [3] Atualizar Fornecedores                        |");
		System.out.println("| [4] Deletar Fornecedor                            |");
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
			menuFornecedor();
			break;
		}
	}	
//================================================================================================================//
	public void cadastro() {
		Scanner ler = new Scanner (System.in);
			
		Fornecedor cadastroForn = new Fornecedor();
			
		System.out.println("***** C A D A S T R O  F O R N E C E D O R *****");
		System.out.println("Informe a razão social: ");
		cadastroForn.setRazaoSocial(ler.next());
		System.out.println("Informe o Nome Fantasia: ");
		cadastroForn.setFantasia(ler.next());
		System.out.println("Imforme o CNPJ: ");
		cadastroForn.setCnpj(ler.next());
		System.out.println("Informe o Tipo de Pessoa");
		cadastroForn.setTipoPessoaId(ler.next());
		
		FornecedorController fornControll = new FornecedorController();
		
		System.out.println(fornControll.cadastrar(cadastroForn));
		menuFornecedor();
	}
//================================================================================================================//
	public void listar() {
		Scanner ler = new Scanner (System.in);
		
		FornecedorController fornControll = new FornecedorController();
		ArrayList<Fornecedor> fornList = fornControll.listar();
		
		if(fornList.isEmpty()) 
			System.out.println("Não possuí Fornecedor Cadastrado!");
		else {			
			System.out.println("> F O R N E C E D O R E S  C A D A S T R A D O S < ");
			System.out.println("--------------------------------------------------");
			
			for (int cont = 0; cont < fornList.size(); cont++) 
				System.out.println(fornList.get(cont).toString());
			
			System.out.println("--------------------------------------------------");
		}
		
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			menuFornecedor();
		default:
			System.out.println("Opção Inválida!");
			listar();
		}
	}
//================================================================================================================//	
	public void atualizar() { //CORRIGIDO
		Scanner ler = new Scanner(System.in);
		Fornecedor forn = new Fornecedor();
	
		System.out.println("=== Atualização de Fornecedor ===\n");
		System.out.println("Digite o nome Fantasia: ");
		forn.setFantasia(ler.next());
		System.out.println("Atualizar Razao Social: ");
		forn.setRazaoSocial(ler.next());
		System.out.println("Atualizar Cnpj: ");
		forn.setCnpj(ler.next());
		System.out.println("Atualizar Tipo Pessoa: ");
		forn.setTipoPessoaId(ler.next());
		
		System.out.println("---------------------------------");
	
		FornecedorController fornControll = new FornecedorController();
		if (!fornControll.atualizar(forn))
			System.out.println("Fornecedor não Encontrado!");
		else
			System.out.println("Fornecedor Atualizado!!!");
		
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			menuFornecedor();
		default:
			System.out.println("Opção Inválida!");
			atualizar();
		}
	}
//================================================================================================================//
	public void deletar() { //CORRIGIDO
		Scanner ler = new Scanner(System.in);
		
		Fornecedor forn = new Fornecedor();
		
		System.out.println("=== Deletar Fornecedor ===\n");
		System.out.println("Informe o Nome Fantasia: ");
		forn.setFantasia(ler.next());
	
		FornecedorController fornControll = new FornecedorController();
		
		if(!fornControll.deletar(forn)) {
			System.out.println("-----------------------------");
			System.out.println("-- Fornecedor não encontrado! --");
			System.out.println("-----------------------------");
		} else {
			System.out.println("-----------------------");
			System.out.println("-- Fornecedor Deletado! --");
			System.out.println("-----------------------");
		}
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
				
		switch(cod) {
		case 0:
			menuFornecedor();
		default:
			System.out.println("Opção Inválida!");
			deletar();
		}
	}
//================================================================================================================//
}
