package controller;

import java.util.ArrayList;
import model.Cliente;
import service.ClienteService;

public class ClienteController {

//================================================================================================================//
	public String cadastrar(Cliente clien) { //CORRIGIDO
				
		ClienteService clienteService = new ClienteService();
				
		if (clienteService.ler(clien))
			return "------------ Fornecedor já Cadastrado! -----------";
		else {
			if (clienteService.escrever(clien)) 
				return "------- Fornecedor Cadastrado com Sucesso! -------";
			else {
				return "Tente Novamente!";
			}
		}
	}
//================================================================================================================//
	public ArrayList<Cliente> listar() { //CORRIGIDO
				
		ClienteService clienteService = new ClienteService();
			
	return clienteService.ler();
	}
//================================================================================================================//
	public Boolean atualizar(Cliente clien) { //CORRIGIDO
		ClienteService clienteService = new ClienteService();
		return clienteService.atualizar(clien);
	}
//================================================================================================================//
	public Boolean deletar(Cliente clien) { //CORRIGIDO
		ClienteService clienteService = new ClienteService();
		return clienteService.excluir(clien);
	}
//================================================================================================================//

}
