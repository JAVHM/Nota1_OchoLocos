package pe.edu.ulima.pm.views

class CartaObj {
    var valor: String
    var palo: String

    constructor(valor: String, palo: String) {
        this.valor = valor
        this.palo = palo
    }
}

fun BarajearMazo(mazo: MutableList<CartaObj>): MutableList<CartaObj>{
    val mazoBarajeado = mutableListOf<CartaObj>().asSequence().shuffled().take(52).toMutableList()

    return mazoBarajeado
}
