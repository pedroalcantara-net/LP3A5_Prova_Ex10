package classes;

public class Pedido {
	private int numeroPedido;
	private double valorPedido;

	public Pedido(int numeroPedido, double valorPedido) {
		this.numeroPedido = numeroPedido;
		this.valorPedido = valorPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public double getValorPedido() {
		return this.valorPedido;
	}
}