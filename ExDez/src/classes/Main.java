package classes;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Pedido p1 = new Pedido(1, 1.2);
		Pedido p2 = new Pedido(2, 1.3);
		Pedido p3 = new Pedido(3, 4);
		Pedido p4 = new Pedido(4, 200.0);
		
		LojaVirtual l1 = new LojaVirtual();

		ThreadProcessarPedido t1 = new ThreadProcessarPedido(p1,l1);
		ThreadProcessarPedido t2 = new ThreadProcessarPedido(p2,l1);
		ThreadProcessarPedido t3 = new ThreadProcessarPedido(p3,l1);
		ThreadProcessarPedido t4 = new ThreadProcessarPedido(p4,l1);
			
		t1.start();
		t2.start();
	    t3.start();
	    t4.start();
	    
	    t1.join();
	    t2.join();
	    t3.join();
	    t4.join();
	}
}
