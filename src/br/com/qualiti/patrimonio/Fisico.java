package br.com.qualiti.patrimonio;

import java.util.Date;

public class Fisico extends Patrimonio {
	
	public enum TIPO {
		MESA,
		CADEIRA,
		MONITOR,
		DESKTOP,
		NOTEBOOK,
		DATA_SHOW
	}
	
	private String marca;
	private String modelo;
	
	public Fisico(String tombamento, NotaFiscal notaFiscal, Date dataEntrada,
			Date dataBaixa, String marca, String modelo) {
		super(tombamento, notaFiscal, dataEntrada, dataBaixa);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
