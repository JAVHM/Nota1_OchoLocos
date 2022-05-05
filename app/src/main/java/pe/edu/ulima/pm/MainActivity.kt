package pe.edu.ulima.pm

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import pe.edu.ulima.pm.views.CartaMesaView
import pe.edu.ulima.pm.views.CartaView
import java.util.function.Predicate

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)//Proceso de inflado

        var mazo=CrearMazoPrincipal()
        mazo=BarajearMazo(mazo);
        var jugadores=CrearJugadores();
        jugadores=BarajearJugadores(jugadores,mazo)



        var mesa= mutableListOf<CartaObj>()
        ActualizarMesa(mesa,mazo)

//        cartaInicial.text= mesa[0].valor+" "+mesa[0].palo

        Turno(mazo,jugadores,mesa,0, false, false,0)
    }
    class CartaObj {
        var valor: String
        var palo: String

        constructor(valor: String, palo: String) {
            this.valor = valor
            this.palo = palo
        }
    }
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

        val jugador1 = JugadorObj(1,"Robert", mutableListOf<CartaObj>())
        val jugador2 = JugadorObj(2,"Josue", mutableListOf<CartaObj>())
        val jugador3 = JugadorObj(3,"Andrés", mutableListOf<CartaObj>())
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
        val carta40 = CartaObj("1","espada")
        mazo.add(carta40)
        val carta41 = CartaObj("2","espada")
        mazo.add(carta41)
        val carta42 = CartaObj("3","espada")
        mazo.add(carta42)
        val carta43 = CartaObj("4","espada")
        mazo.add(carta43)
        val carta44 = CartaObj("5","espada")
        mazo.add(carta44)
        val carta45 = CartaObj("6","espada")
        mazo.add(carta45)
        val carta46 = CartaObj("7","espada")
        mazo.add(carta46)
        val carta47 = CartaObj("8","espada")
        mazo.add(carta47)
        val carta48 = CartaObj("9","espada")
        mazo.add(carta48)
        val carta49 = CartaObj("10","espada")
        mazo.add(carta49)
        val carta50 = CartaObj("J","espada")
        mazo.add(carta50)
        val carta51 = CartaObj("Q","espada")
        mazo.add(carta51)
        val carta52 = CartaObj("K","espada")
        mazo.add(carta52)

//    Dios mio ayudame
        return mazo
    }
    fun BarajearMazo(mazo: MutableList<CartaObj>): MutableList<CartaObj>{
        var mazoBarajeado = mazo.asSequence().shuffled().take(52).toMutableList()
        print("Cantida de mazo: "+mazoBarajeado.size)
        return mazoBarajeado
    }
    fun AddCartasJugador(jugadorObj: JugadorObj, mazo: MutableList<CartaObj>, n: Int){
        for (i in 1..n){
            jugadorObj.cartasMano = (listOf<CartaObj>(mazo[0]).toMutableList() + jugadorObj.cartasMano) as MutableList<CartaObj>
            println("Anadir a " + jugadorObj.nombre + " la carta : " + mazo[0].palo + "|" +mazo[0].valor)
            mazo.removeAt(0)
        }
    }
    fun BarajearJugadores(jugadores: MutableList<JugadorObj>, mazo: MutableList<CartaObj>): MutableList<JugadorObj>{
        val jugadorBarajeado = jugadores.asSequence().shuffled().take(52).toMutableList()
        for (j in jugadorBarajeado){
            println(j.nombre)
            AddCartasJugador(j, mazo, 8)
        }
        return jugadorBarajeado
    }
    fun ActualizarMesa(mesa: MutableList<CartaObj>, mazo: MutableList<CartaObj>){
        mesa.add(mazo[0])
        mazo.removeAt(0)
        var CartaMesa=findViewById<LinearLayout>(R.id.cartaMesa);
        CartaMesa.removeAllViews()
        var middle= CartaMesaView(this,mesa[0].valor.toString(),mesa[0].palo)
        CartaMesa.addView(middle)
    }
    fun MostrarAlertaVictoria(){
        MaterialAlertDialogBuilder(this)
            .setTitle("¡FELICIDADES!")
            .setMessage("¡Has utilizado tu última carta y acabas de ganar el juego!")
            .setPositiveButton("¡Bien!") {dialog, which ->
                finish()
            }
            .show()
    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun <T> remove(list: MutableList<T>, predicate: Predicate<T>) {
        list.removeIf { x: T -> predicate.test(x) }
    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun ActualizarJugadorAMesa(mesa: MutableList<CartaObj>, jugadorCartas: JugadorObj, carta: CartaObj){
        //Remueve de la mesa
        mesa.removeAt(0)
        //Añade a la mesa
        mesa.add(carta)
        //Remueve del jugador
        var cartaRemove = Predicate { day: CartaObj -> day == carta }
        remove(jugadorCartas.cartasMano, cartaRemove)
        //Limpia el view
        var CartaMesa=findViewById<LinearLayout>(R.id.cartaMesa);
        CartaMesa.removeAllViews()
        //Instancia en el view
        var middle= CartaMesaView(this,mesa[0].valor.toString(),mesa[0].palo)
        CartaMesa.addView(middle)
    }
    fun SiguienteJugadorIdj(idj:Int) : Int{
        var idTemp2 = 0
        if (idj >= 2){
            idTemp2 = 0
        }else{
            idTemp2 = idj + 1
        }
        return idTemp2
    }
    fun CasoK(mazo: MutableList<CartaObj>, jugadorTurno: MutableList<JugadorObj>, idj:Int, n:Int){
        println("Caso K concluido," + jugadorTurno[idj].nombre + " no tiene una carta K, recibe " + n + " cartas más")
        AddCartasJugador(jugadorTurno[idj], mazo, n)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun Turno(mazo: MutableList<CartaObj>,
              jugadorTurno: MutableList<JugadorObj>,
              mesa: MutableList<CartaObj>,
              idj:Int, robado:Boolean,
              casoK:Boolean,
              kAcum:Int){
        var nombre=findViewById<TextView>(R.id.Nombre)
        nombre.text=jugadorTurno[idj].nombre + "(" + jugadorTurno[idj].cartasMano.size + ")" ;
        var idTemp = idj //idj no es modificable
        var AreaCartas=findViewById<LinearLayout>(R.id.CartaZona);
        AreaCartas.removeAllViews()

        //Caso K varaibles
        var casoKtemp = casoK
        var kAcumtemp = kAcum
        //Buttons
        val btnPasar : Button = findViewById(R.id.pasar)
        val btnRobar : Button = findViewById(R.id.robar)
        btnPasar.setOnClickListener { b ->
            if(robado == true){
                Turno(mazo, jugadorTurno, mesa, SiguienteJugadorIdj(idTemp), false, casoKtemp,kAcumtemp)
            }
        }
        btnRobar.setOnClickListener { b ->
            if (robado == false){
                AddCartasJugador(jugadorTurno[idTemp], mazo , 1)
                Turno(mazo, jugadorTurno, mesa, idTemp, true, casoKtemp,kAcumtemp)
            }
        }
        if (jugadorTurno[idTemp].cartasMano.size == 0){
//            El jugador acaba de ganar
            btnPasar.setOnClickListener{b ->
                MostrarAlertaVictoria()
            }
        }
        else{
            for (cartaJ in jugadorTurno[idj].cartasMano){
                var cartita=CartaView(this,cartaJ.valor.toString(),cartaJ.palo)
                AreaCartas.addView(cartita,400,250)

                cartita.setOnClickListener { c->
                    val carta = c as CartaView
                    println("Carta " + carta.numero + " de "+ carta.simbolo + " seleccionada")
                    if (cartaJ.palo == mesa.last().palo || cartaJ.valor == mesa.last().valor){
                        println("Es usable")
                        if (cartaJ.valor == "K"){
                            kAcumtemp =+ 3
                            ActualizarJugadorAMesa(mesa, jugadorTurno[idTemp],cartaJ)
                            Turno(mazo, jugadorTurno, mesa, SiguienteJugadorIdj(idTemp), false, true, kAcumtemp)
                        }else if (casoKtemp == true){
                            println("Casao K, no juego K, se le suman cartas")
                            ActualizarJugadorAMesa(mesa, jugadorTurno[idTemp],cartaJ)
                            AddCartasJugador(jugadorTurno[idTemp], mazo , kAcum)
                            Turno(mazo, jugadorTurno, mesa, SiguienteJugadorIdj(idTemp), false, false,0)
                        }else{
                            ActualizarJugadorAMesa(mesa, jugadorTurno[idTemp],cartaJ)
                            Turno(mazo, jugadorTurno, mesa, SiguienteJugadorIdj(idTemp), false, false,0)
                        }
                        if(cartaJ.valor == "J"){
                            ActualizarJugadorAMesa(mesa, jugadorTurno[idTemp],cartaJ)
                            Turno(mazo, jugadorTurno, mesa, SiguienteJugadorIdj(SiguienteJugadorIdj(idTemp)), false, false,0)
                        }
                    } else{
                      println("no es usable")
                    }
                }
            }
        }
    }


}
