package edu.tallerweb.cuentas;

public class CuentaCorriente extends AbstractCuenta{
	private double montoDescubierto;
	
public CuentaCorriente(final Double descubiertoTotal) {
	this.montoDescubierto = descubiertoTotal;	
		/*throw new RuntimeException("No implementado aún");*/
	}
	
public void depositar(final Double monto) {
	this.depositar(monto);
		/*throw new RuntimeException("No implementado aún");*/
	}

public void extraer(final Double monto) {
	double montoTotal = this.montoDescubierto + this.monto;
	double montoAExtraer = monto;
	if(montoTotal - montoAExtraer < 0){
		throw new CuentaBancariaException("Su monto no es suficiente para realizar la extracci�n");
		}
	if(montoAExtraer > this.monto){
		montoAExtraer -= this.monto;
		this.monto = 0;
		this.montoDescubierto -= montoAExtraer + montoAExtraer*0.05;
	} else{
		this.extraer(montoAExtraer);
		}
	/*throw new RuntimeException("No implementado aún");*/
}

public Double getSaldo() {
	return this.getMonto();
		/*throw new RuntimeException("No implementado aún");*/
	}

public Double getDescubierto() {
	return this.montoDescubierto;
		/*throw new RuntimeException("No implementado aún");*/
	}

}
