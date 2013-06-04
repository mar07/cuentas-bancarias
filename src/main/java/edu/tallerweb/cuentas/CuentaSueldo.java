package edu.tallerweb.cuentas;

public class CuentaSueldo extends AbstractCuenta{

	
public void depositar(final Double monto) {
	this.depositar(monto);
	/*throw new RuntimeException("No implementado aún");*/
	}

public void extraer(final Double monto) {
	this.extraer(monto);
	/*throw new RuntimeException("No implementado aún");*/
	}

public Double getSaldo() {
	return this.getMonto();
	/*throw new RuntimeException("No implementado aún");*/
	}

}
