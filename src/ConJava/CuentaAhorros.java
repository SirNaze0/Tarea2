package ConJava;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede consignar.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            if (cantidad <= saldo) {
                super.retirar(cantidad);
            } else {
                System.out.println("Fondos insuficientes para retirar.");
            }
        } else {
            System.out.println("Cuenta inactiva, no se puede retirar.");
        }
    }

    @Override
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo >= 10000;
    }

    @Override
    public void imprimir() {
        System.out.println("=== Cuenta de Ahorros ===");
        super.imprimir();
        System.out.println("Cuenta activa: " + activa);
        System.out.println("Total transacciones: " + (numeroConsignaciones + numeroRetiros));
    }
}
