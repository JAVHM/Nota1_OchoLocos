package pe.edu.ulima.pm.views

import java.util.*
import kotlin.random.Random
public class JugadorObj {
    val idj: Int
    val nombre: String
    var cartasMano: MutableList<CartaObj>

    constructor(idj: Int, nombre: String, cartasMano: MutableList<CartaObj>) {
        this.idj = idj
        this.nombre = nombre
        this.cartasMano = cartasMano
    }

}

