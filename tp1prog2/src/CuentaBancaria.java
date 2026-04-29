public class CuentaBancaria {
    private double saldoCuenta;
    private int numeroCuenta;

    public CuentaBancaria(double saldoCuenta , int numeroCuenta) {
        this.saldoCuenta = saldoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    public void depositarSaldo(double saldo) {
        if (saldo > 0 ) {
            this.saldoCuenta += saldo;
        }
        else {
            System.out.println("Tenes que agregar un valor valido.");
        }
    }

    public double verSaldo() {
        return saldoCuenta;
    }
}
