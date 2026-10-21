package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private String Numero;
	private String Titular;
	private List<Movimiento> movimientos;
	 
	public Cuenta(double saldoInicial) {
		this.movimientos = new ArrayList<>();

		if (saldoInicial > 0) {
			this.movimientos.add(new Movimiento(saldoInicial, Signo.H, "Saldo inicial"));
		}
	}

	public double getSaldo() {
		double saldoCalculado = 0.0;
		for (Movimiento mov : movimientos) {
			if (mov.getSigno() == Signo.H) {
				saldoCalculado += mov.getImporte(); 
			} else if (mov.getSigno() == Signo.D) {
				saldoCalculado -= mov.getImporte();
			}
		}
		return saldoCalculado;
	}
	
	public void ingresar(double x) {
		this.movimientos.add(new Movimiento(x, Signo.H, "Ingreso"));
	}
	
	public void retirar(double x) {
		if (this.getSaldo() - x >= -500) {
			this.movimientos.add(new Movimiento(x, Signo.D, "Reintegro"));
		} else {
			System.out.println("Fondos insuficientes (saldo " + this.getSaldo() + "€) para el reintegro de " + x + "€");
		}
	}

}