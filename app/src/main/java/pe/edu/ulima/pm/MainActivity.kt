package pe.edu.ulima.pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pe.edu.ulima.pm.views.ULFaceView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)//Proceso de inflado

        val faceView = findViewById<ULFaceView>(R.id.cara)
        faceView.setOnClickListener { v ->
            val face = v as ULFaceView
            face.mBocaHeight += 50
        }
    }
}