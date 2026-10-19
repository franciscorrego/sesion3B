package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double x) {
		this.saldo=25;
	}
	
	public void retirar(double x) {
		this.saldo=0;
	}

}
