package classes;

public class ThreadProcessarPedido extends Thread {
    private Pedido pedido;
    private LojaVirtual loja;
    
    public ThreadProcessarPedido(Pedido pedido, LojaVirtual loja) {
        this.pedido = pedido;
        this.loja = loja;
    }
    
    public void run() {
        try {
			loja.processarPedido(pedido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
