package br.com.qualiti.patrimonio;

import java.util.Date;

import br.com.qualiti.pessoal.Pessoa;

public class NotaFiscal {
	
	private int numero;
	private Pessoa fornecedor;
	private Date data;
	
	public NotaFiscal(int numero, Pessoa fornecedor, Date data) {
		super();
		this.numero = numero;
		this.fornecedor = fornecedor;
		this.data = data;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Pessoa fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
