package exemplos.ex001.application;

import java.util.Date;

import exemplos.ex001.entities.Order;
import exemplos.ex001.entities.OrderStatus;

public class Main {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order.toString());
		
//		status do pedido
		OrderStatus os1 = OrderStatus.DELIVERED;
		
//		status em que o proprio user pode definir de string para enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
