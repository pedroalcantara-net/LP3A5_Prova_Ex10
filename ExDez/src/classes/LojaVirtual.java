package classes;

public class LojaVirtual {
	public void processarPedido(Pedido pedido) throws InterruptedException {
		System.out.println("Processando pedido " + pedido.getNumeroPedido());
		Thread.sleep(2000);
		System.out.println("Pedido " + pedido.getNumeroPedido() + " processado com sucesso. Valor total: "
				+ pedido.getValorPedido());
	}
}
