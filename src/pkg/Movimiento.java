package pkg;

public class Movimiento {
	private double importe;
	private Signo signo;
	private String detalle;
	
	public Movimiento(double importe, Signo signo, String detalle) {
		this.importe = importe;
		this.signo = signo;
		this.detalle = detalle;
	}

	public double getImporte() {
		return importe;
	}

	public Signo getSigno() {
		return signo;
	}

	public String getDetalle() {
		return detalle;
	}
}
