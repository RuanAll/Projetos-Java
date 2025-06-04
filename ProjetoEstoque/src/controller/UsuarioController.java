package controller;

import model.Usuario;
import service.UsuarioService;
import java.util.ArrayList;

public class UsuarioController {
//================================================================================================================//
	public String cadastrar(Usuario user) { //CORRIGIDO
		
		UsuarioService userService = new UsuarioService();
		
		if (userService.ler(user))
			return "------------ Usuário já Cadastrado! -----------";
		else {
			if (userService.escrever(user)) 
				return "------- Usuário Cadastrado com Sucesso! -------";
			else {
				return "Tente Novamente!";
			}
		}
	}
//================================================================================================================//
	public ArrayList<Usuario> listar() { //CORRIGIDO
		UsuarioService userService = new UsuarioService();
		return userService.ler();
	}
//================================================================================================================//
	public Boolean atualizar(Usuario user) { //CORRIGIDO
		UsuarioService userService = new UsuarioService();
		return userService.atualizar(user);
	}
//================================================================================================================//
	public Boolean deletar(Usuario user) { //CORRIGIDO
		UsuarioService userService = new UsuarioService();
		return userService.excluir(user);
	}
//================================================================================================================//
}
