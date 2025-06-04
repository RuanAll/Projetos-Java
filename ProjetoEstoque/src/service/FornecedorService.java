package service;

import model.Fornecedor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
	
public class FornecedorService {
	private final String DIR_FORN_DB = "src/data_base/fornecedor.txt";

//================================================================================================================//
	public Boolean escrever(Fornecedor forn) { //CORRIGIDO
		
		try {	
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_FORN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				int contador = 0;
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					contador = contador + 1;
				}
				
				contador = contador + 1;
				
				String dadoEscrito = contador + "; " + forn.getFantasia() + "; " + forn.getRazaoSocial() + "; " + forn.getCnpj() + "; " + forn.getTipoPessoaId();
				
				File arquivo = new File(DIR_FORN_DB);
				FileWriter escreverArquivo = new FileWriter(arquivo, true);
				BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
				
				memoriaEscrita.write(dadoEscrito);
				memoriaEscrita.newLine();
				memoriaEscrita.close();
				
				return true;
				
			} else {
				criarArquivo();
				escrever(forn);
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
	public Boolean ler(Fornecedor forn) { //CORRIGIDO
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_FORN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					if(forn.getFantasia().equals(linha_split[1]))
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
	public ArrayList<Fornecedor> ler() { //CORRIGIDO
		ArrayList<Fornecedor> listForn = new ArrayList<>();
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_FORN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					Fornecedor forn = new Fornecedor();
					forn.setId(Integer.parseInt(linha_split[0]));
					forn.setFantasia(linha_split[1]);
					forn.setRazaoSocial(linha_split[2]);
					forn.setCnpj(linha_split[3]);
					forn.setTipoPessoaId(linha_split[4]);
					
					listForn.add(forn);
				}
			}		
		
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível abrir o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		
		} catch (IOException e) {
			System.out.println("Não foi possível ler o Arquivo!");
			System.out.println("Erro: " + e.getMessage());
		}	
		return listForn;
	}
//================================================================================================================//
	public Boolean excluir(Fornecedor forn) {	//CORRIGIDO
		Boolean excluido = false;
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_FORN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				ArrayList<String> gravarList = new ArrayList<>();
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
					
					if(!forn.getFantasia().equals(linha_split[1])) {
						gravarList.add(linha);
					} else {
						excluido = true;
					}
				}
				
				leituraArquivo.close();
				memoriaLeitura.close();
				
				File arquivo = new File(DIR_FORN_DB) ;
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
	public Boolean atualizar(Fornecedor forn) { //CORRIGIDO	
		Boolean atualizado = false;
		
		try {
			if (existeArquivo()) {
				
				FileReader leituraArquivo = new FileReader(DIR_FORN_DB);
				BufferedReader memoriaLeitura = new BufferedReader(leituraArquivo);
				
				ArrayList<String> gravarList = new ArrayList<>();
				String linha = null;
				
				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linha_split = linha.split("; ");
						
					if(forn.getFantasia().equals(linha_split[1])) {
						String newLinha = linha_split[0] + "; " + linha_split[1] + "; " + forn.getRazaoSocial() + "; " + forn.getCnpj() + "; " + forn.getTipoPessoaId();
						gravarList.add(newLinha);
						atualizado = true;
					} else {
						gravarList.add(linha);
					}
				}
					
				leituraArquivo.close();
				memoriaLeitura.close();
					
				File arquivo = new File(DIR_FORN_DB) ;
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
		File arquivo = new File(DIR_FORN_DB);
			
		return arquivo.exists();
	}
//================================================================================================================//	
	private Boolean criarArquivo() { //CORRIGIDO
			
		try {
			File arquivo = new File(DIR_FORN_DB);
				
			return arquivo.createNewFile();
					
		} catch (IOException e){
			System.out.println("Erro ao Criar o Arquivo de Usuário!");
			System.out.println("Erro: " + e.getMessage());
			return false;
		}
	}
//================================================================================================================//
}
