package ConJava;

public class MainJava {
    public static void main(String[] args) {
        // Crear una cuenta de ahorros con saldo inicial y tasa anual con constructor
        CuentaAhorros cuentaAhorros = new CuentaAhorros(12000, 12);

        // Realizar operaciones de consigna y retiro
        cuentaAhorros.consignar(3000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(1000);
        cuentaAhorros.retirar(500);
        cuentaAhorros.retirar(700);
        cuentaAhorros.retirar(600);    // 5to retiro -> genera comisión adicional

        // Realizar extracto mensual
        cuentaAhorros.extractoMensual();

        // Imprimir estado final
        cuentaAhorros.imprimir();
    }
}
