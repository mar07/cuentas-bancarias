package edu.tallerweb.cuentas;

public class CajaAhorros extends AbstractCuenta{

	public int cantidadExtracciones = 0;

	public void depositar(final Double monto) {
		this.depositar(monto);
		/*throw new RuntimeException("No implementado aún");*/
	}

	public void extraer(final Double monto) {
		this.extraer(monto);
		cantidadExtracciones++;
		if(cantidadExtracciones > 5){
			this.monto -= 6;
		}
		/*throw new RuntimeException("No implementado aún");*/
	}

	public Double getSaldo() {
		return this.getMonto();
		/*throw new RuntimeException("No implementado aún");*/
	}

}
