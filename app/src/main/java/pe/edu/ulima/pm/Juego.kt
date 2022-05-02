package pe.edu.ulima.pm
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pe.edu.ulima.pm.views.ULFaceView
import pe.edu.ulima.pm.views.CartaObj
import pe.edu.ulima.pm.views.JugadorObj

class Juego {
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
    fun CrearMazoPrincipal(): MutableList<CartaObj>{

        var mazo = mutableListOf<CartaObj>()

//    Corazones
        val carta1 = CartaObj("1","corazon")
        mazo.add(carta1)
        val carta2 = CartaObj("2","corazon")
        mazo.add(carta2)
        val carta3 = CartaObj("3","corazon")
        mazo.add(carta3)
        val carta4 = CartaObj("4","corazon")
        mazo.add(carta4)
        val carta5 = CartaObj("5","corazon")
        mazo.add(carta5)
        val carta6 = CartaObj("6","corazon")
        mazo.add(carta6)
        val carta7 = CartaObj("7","corazon")
        mazo.add(carta7)
        val carta8 = CartaObj("8","corazon")
        mazo.add(carta8)
        val carta9 = CartaObj("9","corazon")
        mazo.add(carta9)
        val carta10 = CartaObj("10","corazon")
        mazo.add(carta10)
        val carta11 = CartaObj("J","corazon")
        mazo.add(carta11)
        val carta12 = CartaObj("Q","corazon")
        mazo.add(carta12)
        val carta13 = CartaObj("K","corazon")
        mazo.add(carta13)

//    Diamantes
        val carta14 = CartaObj("1","diamante")
        mazo.add(carta14)
        val carta15 = CartaObj("2","diamante")
        mazo.add(carta15)
        val carta16 = CartaObj("3","diamante")
        mazo.add(carta16)
        val carta17 = CartaObj("4","diamante")
        mazo.add(carta17)
        val carta18 = CartaObj("5","diamante")
        mazo.add(carta18)
        val carta19 = CartaObj("6","diamante")
        mazo.add(carta19)
        val carta20 = CartaObj("7","diamante")
        mazo.add(carta20)
        val carta21 = CartaObj("8","diamante")
        mazo.add(carta21)
        val carta22 = CartaObj("9","diamante")
        mazo.add(carta22)
        val carta23 = CartaObj("10","diamante")
        mazo.add(carta23)
        val carta24 = CartaObj("J","diamante")
        mazo.add(carta24)
        val carta25 = CartaObj("Q","diamante")
        mazo.add(carta25)
        val carta26 = CartaObj("K","diamante")
        mazo.add(carta26)

//    Treboles
        val carta27 = CartaObj("1","trebol")
        mazo.add(carta27)
        val carta28 = CartaObj("2","trebol")
        mazo.add(carta28)
        val carta29 = CartaObj("3","trebol")
        mazo.add(carta29)
        val carta30 = CartaObj("4","trebol")
        mazo.add(carta30)
        val carta31 = CartaObj("5","trebol")
        mazo.add(carta31)
        val carta32 = CartaObj("6","trebol")
        mazo.add(carta32)
        val carta33 = CartaObj("7","trebol")
        mazo.add(carta33)
        val carta34 = CartaObj("8","trebol")
        mazo.add(carta34)
        val carta35 = CartaObj("9","trebol")
        mazo.add(carta35)
        val carta36 = CartaObj("10","trebol")
        mazo.add(carta36)
        val carta37 = CartaObj("J","trebol")
        mazo.add(carta37)
        val carta38 = CartaObj("Q","trebol")
        mazo.add(carta38)
        val carta39 = CartaObj("K","trebol")
        mazo.add(carta39)

//    Picas
        val carta40 = CartaObj("1","pica")
        mazo.add(carta40)
        val carta41 = CartaObj("2","pica")
        mazo.add(carta41)
        val carta42 = CartaObj("3","pica")
        mazo.add(carta42)
        val carta43 = CartaObj("4","pica")
        mazo.add(carta43)
        val carta44 = CartaObj("5","pica")
        mazo.add(carta44)
        val carta45 = CartaObj("6","pica")
        mazo.add(carta45)
        val carta46 = CartaObj("7","pica")
        mazo.add(carta46)
        val carta47 = CartaObj("8","pica")
        mazo.add(carta47)
        val carta48 = CartaObj("9","pica")
        mazo.add(carta48)
        val carta49 = CartaObj("10","pica")
        mazo.add(carta49)
        val carta50 = CartaObj("J","pica")
        mazo.add(carta50)
        val carta51 = CartaObj("Q","pica")
        mazo.add(carta51)
        val carta52 = CartaObj("K","pica")
        mazo.add(carta52)

//    Dios mio ayudame
        return mazo
    }

    fun ComenzarPartida(){
        val jugadores = CrearJugadores()
        val mazo = CrearMazoPrincipal()

    }

    fun Turno(jugadorTurno: JugadorObj){

    }
}