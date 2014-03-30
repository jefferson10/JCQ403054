package br.com.qualiti.patrimonio;

import java.util.Date;

public class Patrimonio {
	
	private String tombamento;
	private NotaFiscal notaFiscal;
	private Date dataEntrada;
	private Date dataBaixa;
	
	public Patrimonio(String tombamento, NotaFiscal notaFiscal,
			Date dataEntrada, Date dataBaixa) {
		super();
		this.tombamento = tombamento;
		this.notaFiscal = notaFiscal;
		this.dataEntrada = dataEntrada;
		this.dataBaixa = dataBaixa;
	}
	public String getTombamento() {
		return tombamento;
	}
	public void setTombamento(String tombamento) {
		this.tombamento = tombamento;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataBaixa() {
		return dataBaixa;
	}
	public void setDataBaixa(Date dataBaixa) {
		this.dataBaixa = dataBaixa;
	}
	
	

}
