package pe.edu.ulima.pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pe.edu.ulima.pm.views.ULFaceView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)//Proceso de inflado

        val cartaMesa=findViewById<TextView>(R.id.CartaM)
        cartaMesa.text="prueba"
    }
}