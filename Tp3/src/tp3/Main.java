package tp3;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Worker worker = new Worker();
		Order order = new Order(cliente, worker);
		System.out.println(order.toString());

	}

}
