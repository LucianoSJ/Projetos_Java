package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelDoColaborador;

public class Colaborador {

	private String nome;
	private NivelDoColaborador nivel;
	private Double baseSalarial;
	
	private Departamento departamento;
	private List<ContratoHoras> contrato = new ArrayList<>();
	
	public Colaborador() {
	}

	public Colaborador(String name, NivelDoColaborador level, Double baseSalary, Departamento department) {
		this.nome = name;
		this.nivel = level;
		this.baseSalarial = baseSalary;
		this.departamento = department;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public NivelDoColaborador getLevel() {
		return nivel;
	}

	public void setLevel(NivelDoColaborador level) {
		this.nivel = level;
	}

	public Double getBaseSalary() {
		return baseSalarial;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalarial = baseSalary;
	}

	public Departamento getDepartment() {
		return departamento;
	}

	public void setDepartment(Departamento department) {
		this.departamento = department;
	}

	public List<ContratoHoras> getContracts() {
		return contrato;
	}

	public void addContract(ContratoHoras contract) {
		contrato.add(contract);
	}
	
	public void removeContract(ContratoHoras contract) {
		contrato.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalarial;
		Calendar cal = Calendar.getInstance();
		for (ContratoHoras c : contrato) {
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
