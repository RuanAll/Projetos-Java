package controller;

import model.Usuario;
import service.UsuarioService;
import java.util.ArrayList;

public class UsuarioController {
//================================================================================================================//
	public String cadastrar(Usuario user) { //CORRIGIDO
		
		UsuarioService userService = new UsuarioService();
		
		if (userService.ler(user))
			return "------------ Usu�rio j� Cadastrado! -----------";
		else {
			if (userService.escrever(user)) 
				return "------- Usu�rio Cadastrado com Sucesso! -------";
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
