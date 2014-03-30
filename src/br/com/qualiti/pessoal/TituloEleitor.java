package br.com.qualiti.pessoal;

public class TituloEleitor {
	
	private String matricula;
	private String zona;
	private String secao;
	public TituloEleitor(String matricula, String zona, String secao) {
		super();
		this.matricula = matricula;
		this.zona = zona;
		this.secao = secao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getSecao() {
		return secao;
	}
	public void setSecao(String secao) {
		this.secao = secao;
	}

	
}
