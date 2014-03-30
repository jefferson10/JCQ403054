package br.com.qualiti.patrimonio;

import java.util.Date;

public class Logico extends Patrimonio {
		
	public enum TIPO {
		SO,
		IDE,
		BANCO_DADOS
	}
	
	private String nome;
	private Date dataExpiracao;
	
	public Logico(String tombamento, NotaFiscal notaFiscal, Date dataEntrada,
			Date dataBaixa, String nome, Date dataExpiracao) {
		super(tombamento, notaFiscal, dataEntrada, dataBaixa);
		this.nome = nome;
		this.dataExpiracao = dataExpiracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
	
	
}
