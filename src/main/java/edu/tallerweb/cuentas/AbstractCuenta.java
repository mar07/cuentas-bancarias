package edu.tallerweb.cuentas;

public abstract class AbstractCuenta {

	protected double monto;
	
	public double getMonto(){
		return monto;
	}

public void setMonto(double monto){
	this.monto = monto;
	}

protected void depositar(double montoADepositar){
	this.monto += montoADepositar;
}

protected void extraer(double montoAExtraer){
	if(this.monto - montoAExtraer < 0){
		throw new CuentaBancariaException("El saldo no es suficiente para realizar la operación");
	}
	this.monto -= montoAExtraer;
}
	
public abstract void depositar(final Double monto);

public abstract void extraer(final Double monto);

}
