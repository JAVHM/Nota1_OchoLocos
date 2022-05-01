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

    public fun CrearJugadores(): MutableList<JugadorObj>{

        var jugadores = mutableListOf<JugadorObj>()

        val jugador1 = JugadorObj(1,"R", mutableListOf<CartaObj>())
        val jugador2 = JugadorObj(2,"J", mutableListOf<CartaObj>())
        val jugador3 = JugadorObj(3,"A", mutableListOf<CartaObj>())
        jugadores.add(jugador1)
        jugadores.add(jugador2)
        jugadores.add(jugador3)

        return jugadores
    }
    public fun CartasJugador(mazo: MutableList<CartaObj>, jugador: JugadorObj, n : Int) {
        for (i in 0..n) {
            var temp = Random.nextInt(0, mazo.size+0)
            var carta = mazo[temp]
            mazo.removeAt(temp)
            jugador.cartasMano.add(carta)
            print("Carta agregada a " + jugador.nombre + ": " + jugador.cartasMano.last().valor + "|" + jugador.cartasMano.last().palo)
        }
    }
}

