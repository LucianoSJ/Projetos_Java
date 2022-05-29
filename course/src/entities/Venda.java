package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.OrderStatus;

public class Venda {

	private Integer id;
	private Date data;
	private OrderStatus status;
	
	public Venda() {
	}

	public Venda(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.data = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return data;
	}

	public void setMoment(Date moment) {
		this.data = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	SimpleDateFormat fdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Override
	public String toString() {
		return "Venda:" + id + ", Data:" + fdt.format(data) + ", Status:" + status;
	}
}
