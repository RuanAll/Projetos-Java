package model;

import java.util.Date;

public class Produto {
	private int cod;
	private String desc;
	private String marca;
	private float precoComp;
	private float precoVend;
	private String dataValidade; //Date
	private int tipoProduto;
	private String cor;
	private int unidade;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public String getDesc () {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getPrecoComp() {
		return precoComp;
	}
	public void setPrecoComp(float precoComp) {
		this.precoComp = precoComp;
	}
	
	public float getPrecoVend() {
		return precoVend;
	}
	public void setPrecoVend(float precoVend) {
		this.precoVend = precoVend;
	}
	
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public int getTipoProtudo() {
		return tipoProduto;
	}
	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	
	
}