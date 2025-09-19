package com.ejemplo

fun main() {
    // Crear una cuenta de ahorros
    val cuentaAhorros = CuentaAhorros("Juan", 9292.0, 12.0)
    cuentaAhorros.consignaciones = 1
    cuentaAhorros.retiros = 5
    cuentaAhorros.comisionMensual = 1000.0
    cuentaAhorros.cuentaActiva = false

    // Mostrar detalles solo de CuentaAhorros
    cuentaAhorros.mostrarSaldo()
    cuentaAhorros.mostrarIntereses()

    // Crear una cuenta corriente
    val cuentaCorriente = CuentaCorriente("Maria", 2000.0, 500.0)
    cuentaCorriente.consignaciones = 3
    cuentaCorriente.retiros = 2
    cuentaCorriente.comisionMensual = 1500.0

    // Mostrar detalles solo de CuentaCorriente (descomenta si quieres ver esta cuenta también)
    // cuentaCorriente.mostrarSaldo()
}
