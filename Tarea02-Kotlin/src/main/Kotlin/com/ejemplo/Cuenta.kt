// Cuenta.kt
package com.ejemplo

open class Cuenta(var titular: String, var saldo: Double) {
    var consignaciones: Int = 0
    var retiros: Int = 0
    var comisionMensual: Double = 0.0
    var cuentaActiva: Boolean = true

    var tasaAnual: Double = 0.0

    open fun mostrarSaldo() {
        println("=== Cuenta ===")
        println("Saldo: $$saldo")
        println("Número de consignaciones: $consignaciones")
        println("Número de retiros: $retiros")
        println("Tasa anual: $tasaAnual%")
        println("Comisión mensual: $$comisionMensual")
        println("Cuenta activa: $cuentaActiva")
        println("Total transacciones: ${consignaciones + retiros}")
    }

    // Método para calcular intereses, será utilizado en las clases derivadas
    open fun calcularIntereses(): Double {
        return saldo * (tasaAnual / 100)
    }
}
