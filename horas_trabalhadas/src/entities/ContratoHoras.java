package entities;

import java.util.Date;

public class ContratoHoras {
	private Date data;
	private Double valorHora;
	private Integer horas;
	
	public ContratoHoras() {
	}

	public ContratoHoras(Date date, Double valuePerHour, Integer hours) {
		this.data = date;
		this.valorHora = valuePerHour;
		this.horas = hours;
	}

	public Date getDate() {
		return data;
	}

	public void setDate(Date date) {
		this.data = date;
	}

	public Double getValuePerHour() {
		return valorHora;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valorHora = valuePerHour;
	}

	public Integer getHours() {
		return horas;
	}

	public void setHours(Integer hours) {
		this.horas = hours;
	}
	
	public double totalValue() {
		return valorHora * horas;
	}
}
