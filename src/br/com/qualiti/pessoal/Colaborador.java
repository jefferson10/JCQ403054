package br.com.qualiti.pessoal;

import java.util.Date;

import br.com.qualiti.endereco.Endereco;

public class Colaborador extends Pessoa {
	
	private Date dataAdmissao;
	private String matricula;
	
	public Colaborador(String nome, String sexo, String cpf, String telefone,
			String rg, Date dataNascimento, Endereco endereco,
			TituloEleitor tituloEleitor, Date dataAdmissao, String matricula) {
		super(nome, sexo, cpf, telefone, rg, dataNascimento, endereco, tituloEleitor);
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
}
