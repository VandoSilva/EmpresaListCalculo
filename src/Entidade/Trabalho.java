package Entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entidade.Enums.nivelTrabalho;

public class Trabalho {

	private String nome;
	private nivelTrabalho level;
	private Double salariobase;
	
	private Departamento departamento;
	private List<HoraContrato> contracts = new ArrayList<>();
	
	public Trabalho() {
		
	}

	public Trabalho(String nome, nivelTrabalho level, Double salariobase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salariobase = salariobase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public nivelTrabalho getLevel() {
		return level;
	}

	public void setLevel(nivelTrabalho level) {
		this.level = level;
	}

	public Double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(Double salariobase) {
		this.salariobase = salariobase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContracts() {
		return contracts;
	}

	
	public void addContract(HoraContrato contracts) {
		((List<HoraContrato>) contracts).add(contracts);
		
	}
	
	public void removeContract(HoraContrato contracts) {
		((List<HoraContrato>) contracts).remove(contracts);
	}
	
	public double income(int year, int month) {
		double sum =salariobase;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contracts ) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
			 sum += c.totalValue();
		}
	}
		return sum;
	}
}