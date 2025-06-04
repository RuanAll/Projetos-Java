package model;

import java.sql.Date;

public class Entrada {
	private int id;
	private int produtoId;
	private int fornecedor;
	private float valor;
	private Date dataLanc;
	private float qnt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}
	
	public int getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Date getDataLanc() {
		return dataLanc;
	}
	public void setDataLanc(Date dataLanc) {
		this.dataLanc = dataLanc;
	}
	
	public float getQnt() {
		return qnt;
	}
	public void setQnt(float qnt) {
		this.qnt = qnt;
	}
	
	
}