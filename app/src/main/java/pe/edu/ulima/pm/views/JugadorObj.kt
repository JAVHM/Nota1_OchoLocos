package pe.edu.ulima.pm.views

class JugadorObj {
    val idj: Int
    val nombre: String
    var cartasMano: MutableList<CartaObj>

    constructor(idj: Int, nombre: String, cartasMano: MutableList<CartaObj>) {
        this.idj = idj
        this.nombre = nombre
        this.cartasMano = cartasMano
    }
}

fun CrearJugadores(): MutableList<JugadorObj>{

    var jugadores = mutableListOf<JugadorObj>()

    val jugador1 = JugadorObj(1,"R", mutableListOf<CartaObj>())
    val jugador2 = JugadorObj(2,"J", mutableListOf<CartaObj>())
    val jugador3 = JugadorObj(3,"A", mutableListOf<CartaObj>())
    jugadores.add(jugador1)
    jugadores.add(jugador2)
    jugadores.add(jugador3)

    return jugadores
}
