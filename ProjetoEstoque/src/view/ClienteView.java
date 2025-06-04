package view;

import java.util.ArrayList;
import java.util.Scanner;
import controller.ClienteController;
import model.Cliente;

public class ClienteView {
//================================================================================================================//
	public void menuCliente() {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|___________ M E N U  D O  C L I E N T E ___________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar Cliente                             |");
		System.out.println("| [2] Listar Todos os Clientes                      |");
		System.out.println("| [3] Atualizar Clientes                            |");
		System.out.println("| [4] Deletar Cliente                               |");
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
		}
	}
//================================================================================================================//
	public void cadastro() {
		Scanner ler = new Scanner (System.in);
		
		Cliente cadastroCliente = new Cliente();
		
		System.out.println("***** C A D A S T R O  C L I E N T E *****");
		System.out.println("Informe a nome: ");
		cadastroCliente.setNome(ler.next());
		System.out.println("Informe o CPF: ");
		cadastroCliente.setCpf(ler.next());
		System.out.println("Imforme o gênero: ");
		cadastroCliente.setGenero(ler.next());
		System.out.println("Informe o endereço: ");
		cadastroCliente.setEnd(ler.next());
		System.out.println("Informe o telefone: ");
		cadastroCliente.setTel(ler.next());
		
		ClienteController clienteControll = new ClienteController();
		
		System.out.println(clienteControll.cadastrar(cadastroCliente));
		menuCliente();
	}
//================================================================================================================//	
	public void listar() {
		Scanner ler = new Scanner (System.in);
		
		ClienteController clienteControll = new ClienteController();
		ArrayList<Cliente> clienteList = clienteControll.listar();

		if(clienteList.isEmpty()) 
			System.out.println("Não possuí Cliente Cadastrado!");
		else {			
			System.out.println("> C L I E N T E S  C A D A S T R A D O S < ");
			System.out.println("------------------------------------------");
				
		for (int cont = 0; cont < clienteList.size(); cont++) 
			System.out.println(clienteList.get(cont).toString());
		
		System.out.println("------------------------------------------");
		}
		
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
			
		switch(cod) {
		case 0:
			menuCliente();
		default:
			System.out.println("Opção Inválida!");
			listar();
		}
	}
//================================================================================================================//	
	public void atualizar() { //CORRIGIDO
		Scanner ler = new Scanner(System.in);
		Cliente clien = new Cliente();
		
		System.out.println("=== Atualização de Cliente ===\n");
		System.out.println("Nome: ");
		clien.setNome(ler.next());
		System.out.println("Atualizar CPF: ");
		clien.setCpf(ler.next());
		System.out.println("Atualizar Genero: ");
		clien.setGenero(ler.next());
		System.out.println("Atualizar Endereço: ");
		clien.setEnd(ler.next());
		System.out.println("Atualizar Telefone: ");
		clien.setTel(ler.next());
			
		System.out.println("---------------------------------");
		
		ClienteController clienteControll = new ClienteController();
		if (!clienteControll.atualizar(clien))
			System.out.println("Fornecedor não Encontrado!");
		else
			System.out.println("Fornecedor Atualizado!!!");
			
		System.out.println("[0] Voltar ");
		int cod = ler.nextInt();
		System.out.println("\n");
				
		switch(cod) {
		case 0:
			menuCliente();
		default:
			System.out.println("Opção Inválida!");
			atualizar();
		}
	}
//================================================================================================================//
	public void deletar() { //CORRIGIDO
		Scanner ler = new Scanner(System.in);
		
		Cliente clien = new Cliente();
		
		System.out.println("=== Deletar Cliente ===\n");
		System.out.println("Informe o Nome do Cliente: ");
		clien.setNome(ler.next());
	
		ClienteController clienteControll = new ClienteController();
		
		if(!clienteControll.deletar(clien)) {
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
			menuCliente();
		default:
			System.out.println("Opção Inválida!");
			deletar();
		}
	}
//================================================================================================================//
}
