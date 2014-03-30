package br.com.qualiti.pessoal;

import java.util.Date;
import java.util.List;

import br.com.qualiti.cursos.AlunoTurma;
import br.com.qualiti.endereco.Endereco;

public class Aluno extends Pessoa {
	
	private String login;
	private String senha;
	private List<AlunoTurma> alunoTurmas;
	
	public Aluno(String nome, String sexo, String cpf, String telefone,
			String rg, Date dataNascimento, Endereco endereco,
			TituloEleitor tituloEleitor, String login, String senha, List<AlunoTurma> alunoTurmas) {
		super(nome, sexo, cpf, telefone, rg, dataNascimento, endereco, tituloEleitor);
		this.login = login;
		this.senha = senha;
		this.alunoTurmas = alunoTurmas;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<AlunoTurma> getAlunoTurmas() {
		return alunoTurmas;
	}

	public void setAlunoTurmas(List<AlunoTurma> alunoTurmas) {
		this.alunoTurmas = alunoTurmas;
	}

	
}
