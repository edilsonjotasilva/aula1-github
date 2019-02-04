package util;

public class ContaBancaria {
	private int conta;

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	private String cliente;
	private double deposito;
	private double saque;
	private double saldo;

	public ContaBancaria(int conta, String cliente, double deposito) {
		this.conta = conta;
		this.cliente = cliente;
		this.deposito = deposito;
	}

	public ContaBancaria(int conta, String cliente) {
		this.conta = conta;
		this.cliente = cliente;

	}

	public void depositar(double deposito) {
		this.deposito = deposito;
		this.setSaldo(this.getSaldo() + deposito);
	}

	public void sacar(double saque) {
		if (saque > this.getSaldo()) {
			System.out.println("!!!! VOCE NÃO TEM SALDO SUFICIENTE! ");
		} else {
			this.saque = saque;
			this.setSaldo(this.getSaldo() - saque);
		}
	}

	@Override
	public String toString() {
		return "ContaBancaria [conta=" + conta + "\ncliente=" + cliente + "de\nposito=" + this.deposito + "\nsaque="
				+ this.saque + "\nsaldo=" + this.getSaldo() + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

}
