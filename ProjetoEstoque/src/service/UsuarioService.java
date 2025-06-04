package service;

import model.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UsuarioService {
	private final String DIR_USER_DB = "src/data_base/usuario.txt";
	
//================================================================================================================//
	public Boolean escrever(Usuario user) { //CORRIGIDO
		try {	
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_USER_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				int contador = 0;
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					contador = contador + 1;
				}
				
				contador = contador + 1;
				
				String dadoEscrito = contador + "; " + user.getUsername() + "; " + user.getPassword();
				
				File arquivo = new File(DIR_USER_DB) ;
				FileWriter escreverArquivo = new FileWriter(arquivo, true);
				BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
				
				memoriaEscrita.write(dadoEscrito);
				memoriaEscrita.newLine();
				memoriaEscrita.close();
				
				return true;
				
			} else {
				criarArquivo();
				escrever(user);
			}
				
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível abrir o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Não foi possível ler o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}
		return false;
	}
//================================================================================================================//
	public Boolean ler(Usuario user) { //CORRIGIDO
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_USER_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					if(user.getUsername().equals(linha_split[1]))
						return true;
				}
			}		
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível abrir o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Não foi possível ler o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}		
		return false;
	}
//================================================================================================================//
	public ArrayList<Usuario> ler() { //CORRIGIDO
		ArrayList<Usuario> listUser = new ArrayList<>();
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_USER_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					Usuario user = new Usuario();
					user.setId(Integer.parseInt(linha_split[0]));
					user.setUsername(linha_split[1]);
					user.setPassword(linha_split[2]);
					
					listUser.add(user);
				}
			}		
		
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível abrir o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Não foi possível ler o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}	
		return listUser;
	}
//================================================================================================================//
	public Boolean excluir(Usuario user) {	//CORRIGIDO
		Boolean excluido = false;
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_USER_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				ArrayList<String> gravarList = new ArrayList<>();
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					if(!user.getUsername().equals(linha_split[1])) {
						gravarList.add(linha);
					} else {
						excluido = true;
					}
				}
				
				leituraArquivo.close();
				memoriaLeitura.close();

				File arquivo = new File(DIR_USER_DB) ;
				FileWriter escreverArquivo = new FileWriter(arquivo, false);
				BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
				
				for (String newLinha : gravarList) {
					memoriaEscrita.write(newLinha);
					memoriaEscrita.newLine();
				}
				
				memoriaEscrita.close();
				
			} else 
				return false;
		
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível abrir o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Não foi possível ler o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}	
		
		return excluido;
	}
//================================================================================================================//
	public Boolean atualizar(Usuario user) { //CORRIGIDO	
		Boolean atualizado = false;
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_USER_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				ArrayList<String> gravarList = new ArrayList<>();
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					if(user.getUsername().equals(linha_split[1])) {
						String newLinha = linha_split[0] + "; " + linha_split[1] + "; " + user.getPassword();
						gravarList.add(newLinha);
						atualizado = true;
					} else {
						gravarList.add(linha);
					}
				}
				
				leituraArquivo.close();
				memoriaLeitura.close();
				
				File arquivo = new File(DIR_USER_DB) ;
				FileWriter escreverArquivo = new FileWriter(arquivo, false);
				BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
				
				for (String newLinha : gravarList) {
					memoriaEscrita.write(newLinha);
					memoriaEscrita.newLine();
				}
				
				memoriaEscrita.close();
				
			} else {
				return false;
			}
			} catch (FileNotFoundException e) {
				System.out.println("Não foi possível abrir o Arquivo!");
				System.out.println("Erro: " + e.getMessage());
			
			} catch (IOException e) {
				System.out.println("Não foi possível ler o Arquivo!");
				System.out.println("Erro: " + e.getMessage());
			}
			return atualizado;
	}
//================================================================================================================//
	private Boolean existeArquivo() { //CORRIGIDO
		File arquivo = new File(DIR_USER_DB);
		
		return arquivo.exists();
	}
//================================================================================================================//	
	private Boolean criarArquivo() { //CORRIGIDO
		try {
			File arquivo = new File(DIR_USER_DB);
			
			return arquivo.createNewFile();
				
		} catch (IOException e){
			System.out.println("Erro ao Criar o Arquivo de Usuário!");
			System.out.println("Erro: " + e.getMessage());
			return false;
		}
	}
//================================================================================================================//
}
