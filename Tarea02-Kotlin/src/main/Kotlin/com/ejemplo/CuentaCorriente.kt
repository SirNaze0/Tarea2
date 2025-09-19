// CuentaCorriente.kt
package com.ejemplo

class CuentaCorriente(titular: String, saldo: Double, descubierto: Double) : Cuenta(titular, saldo) {
    var descubierto: Double = descubierto

    override fun mostrarSaldo() {
        super.mostrarSaldo() // Llamamos al método de la clase base
        println("Límite descubierto: $$descubierto")
    }

    // No sobrescribimos calcularIntereses, pero puedes añadir lógica de interés para cuentas corrientes si lo deseas
}
