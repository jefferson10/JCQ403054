package br.com.qualiti.pessoal;

import java.util.Date;

import br.com.qualiti.endereco.Endereco;

public class Funcionario extends Colaborador {
	
	private double salario;
	private String cargo;
	private String setor;
	
	public Funcionario(String nome, String sexo, String cpf, String telefone,
			String rg, Date dataNascimento, Endereco endereco,
			TituloEleitor tituloEleitor, Date dataAdmissao, String matricula, double salario, String cargo, String setor) {
		super(nome, sexo, cpf, telefone, rg, dataNascimento, endereco, tituloEleitor,
				dataAdmissao, matricula);
		this.salario = salario;
		this.cargo = cargo;
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	
}
