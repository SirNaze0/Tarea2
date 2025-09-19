package ConJava;

public class CuentaCorriente extends Cuenta {
    private float sobregiro = 0;

    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            float exceso = cantidad - saldo;
            saldo = 0;
            sobregiro += exceso;
        }
        numeroRetiros++;
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                saldo += cantidad;
            } else {
                sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
        numeroConsignaciones++;
    }

    @Override
    public void imprimir() {
        System.out.println("=== Cuenta Corriente ===");
        super.imprimir();
        System.out.println("Total transacciones: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Sobregiro: $" + sobregiro);
    }
}
