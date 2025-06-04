package controller;

import java.util.ArrayList;
import model.Fornecedor;
import service.FornecedorService;

public class FornecedorController {
//================================================================================================================//
	public String cadastrar(Fornecedor forn) { //CORRIGIDO
			
		FornecedorService fornService = new FornecedorService();
			
		if (fornService.ler(forn))
			return "------------ Fornecedor já Cadastrado! -----------";
		else {
			if (fornService.escrever(forn)) 
				return "------- Fornecedor Cadastrado com Sucesso! -------";
			else {
				return "Tente Novamente!";
			}
		}
	}
//================================================================================================================//
	public ArrayList<Fornecedor> listar() { //CORRIGIDO
		FornecedorService fornService = new FornecedorService();
	return fornService.ler();
	}
//================================================================================================================//
	public Boolean atualizar(Fornecedor forn) { //CORRIGIDO
		FornecedorService fornService = new FornecedorService();
		return fornService.atualizar(forn);
	}
//================================================================================================================//
	public Boolean deletar(Fornecedor forn) { //CORRIGIDO	
		FornecedorService fornService = new FornecedorService();	
		return fornService.excluir(forn);
	}
//================================================================================================================//
}
