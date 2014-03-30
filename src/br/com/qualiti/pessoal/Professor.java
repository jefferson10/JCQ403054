package br.com.qualiti.pessoal;

import java.util.Date;
import java.util.List;

import br.com.qualiti.endereco.Endereco;

public class Professor extends Colaborador {
	
	private List<String> turma;
	private String horaAula;
	private List<String> disciplinas;
	
	public Professor(String nome, String sexo, String cpf, String telefone,
			String rg, Date dataNascimento, Endereco endereco,
			TituloEleitor tituloEleitor, Date dataAdmissao, String matricula, List<String> turma, String horaAula, List<String> disciplinas) {
		super(nome, sexo, cpf, telefone, rg, dataNascimento, endereco, tituloEleitor,
				dataAdmissao, matricula);
		this.turma = turma;
		this.horaAula = horaAula;
		this.disciplinas = disciplinas;
	}

	public List<String> getTurma() {
		return turma;
	}

	public void setTurma(List<String> turma) {
		this.turma = turma;
	}

	public String getHoraAula() {
		return horaAula;
	}

	public void setHoraAula(String horaAula) {
		this.horaAula = horaAula;
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	
}
