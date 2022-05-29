package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Venda;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Venda venda = new Venda(1080, new Date(), OrderStatus.ABERTA);
		
		System.out.println(venda);
		
		OrderStatus os1 = OrderStatus.ABERTA;
		OrderStatus os2 = OrderStatus.valueOf("FINALIZADA"); //Converte String para enum

		System.out.println(os1);
		System.out.println(os2);
	}
}
