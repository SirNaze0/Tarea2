// CuentaAhorros.kt
package com.ejemplo

class CuentaAhorros(titular: String, saldo: Double, interes: Double) : Cuenta(titular, saldo) {

    init {
        tasaAnual = interes // Asignar la tasa de interés cuando se crea la cuenta
    }

    // Sobrescribimos calcularIntereses para especificar la lógica de intereses en CuentaAhorros
    override fun calcularIntereses(): Double {
        val intereses = saldo * (tasaAnual / 100)
        return intereses
    }

    // Mostramos el saldo de la cuenta y los intereses
    fun mostrarIntereses() {
        val intereses = calcularIntereses()
        println("Intereses ganados: $$intereses")
    }
}
