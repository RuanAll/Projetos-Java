package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Cliente;

public class ClienteService {
	private final String DIR_CLIEN_DB = "src/data_base/cliente.txt";
//================================================================================================================//

//================================================================================================================//
	public Boolean escrever(Cliente clien) { //CORRIGIDO
		try {	
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_CLIEN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				int contador = 0;
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					contador = contador + 1;
				}
				
				contador = contador + 1;
				
				String dadoEscrito = contador + "; " + clien.getNome() + "; " + clien.getCpf() + "; " + clien.getGenero() + "; " + clien.getEnd() + "; " + clien.getTel();
				
				File arquivo = new File(DIR_CLIEN_DB);
				FileWriter escreverArquivo = new FileWriter(arquivo, true);
				BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
				
				memoriaEscrita.write(dadoEscrito);
				memoriaEscrita.newLine();
				memoriaEscrita.close();
				
				return true;
				
			} else {
				criarArquivo();
				escrever(clien);
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
	public Boolean ler (Cliente clien) { //CORRIGIDO	
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_CLIEN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				String linha = null;
					
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
						
					if(clien.getNome().equals(linha_split[1]))
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
	public ArrayList<Cliente> ler() { //CORRIGIDO
		ArrayList<Cliente> listClien = new ArrayList<>();
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_CLIEN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					Cliente clien = new Cliente();
					clien.setId(Integer.parseInt(linha_split[0]));
					clien.setNome(linha_split[1]);
					clien.setCpf(linha_split[2]);
					clien.setGenero(linha_split[3]);
					clien.setEnd(linha_split[4]);
					clien.setTel(linha_split[5]);
					
					listClien.add(clien);
				}
			}		
		
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível abrir o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Não foi possível ler o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}	
		return listClien;
	}
//================================================================================================================//
	public Boolean excluir(Cliente clien) {	//CORRIGIDO
		Boolean excluido = false;
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_CLIEN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				ArrayList<String> gravarList = new ArrayList<>();
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					if(!clien.getNome().equals(linha_split[1])) {
						gravarList.add(linha);
					} else {
						excluido = true;
					}
				}
				
				leituraArquivo.close();
				memoriaLeitura.close();
				
				File arquivo = new File(DIR_CLIEN_DB) ;
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
	public Boolean atualizar(Cliente clien) { //CORRIGIDO	
		Boolean atualizado = false;
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_CLIEN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				ArrayList<String> gravarList = new ArrayList<>();
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
						
					if(clien.getNome().equals(linha_split[1])) {
						String newLinha = linha_split[0] + "; " + linha_split[1] + "; " + clien.getCpf() + "; " + clien.getGenero() + "; " + clien.getEnd() + "; " + clien.getTel();
						gravarList.add(newLinha);
						atualizado = true;
					} else {
						gravarList.add(linha);
					}
				}
					
				leituraArquivo.close();
				memoriaLeitura.close();
					
				File arquivo = new File(DIR_CLIEN_DB) ;
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
		File arquivo = new File(DIR_CLIEN_DB);
			
		return arquivo.exists();
	}
//================================================================================================================//	
	private Boolean criarArquivo() { //CORRIGIDO
			
		try {
			File arquivo = new File(DIR_CLIEN_DB);
				
			return arquivo.createNewFile();
					
		} catch (IOException e){
			System.out.println("Erro ao Criar o Arquivo de Usuário!");
			System.out.println("Erro: " + e.getMessage());
			return false;
		}
	}
//================================================================================================================//
}
