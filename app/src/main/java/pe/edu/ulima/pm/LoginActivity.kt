package pe.edu.ulima.pm

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : Activity(){
    private var mButIngresar : Button? = null
    private var mEteUsuarioCorreo : EditText? = null
    private var mEteUsuarioPassword : EditText? = null
    private var mTviMensaje : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Obtener referencias
        mButIngresar = findViewById(R.id.btnIngresar)
        mEteUsuarioCorreo = findViewById(R.id.eteUsuarioCorreo)
        mEteUsuarioPassword = findViewById(R.id.eteUsuarioPassword)
        mTviMensaje = findViewById(R.id.tviMensaje)

        mButIngresar!!.setOnClickListener { v : View ->
            Log.i("LogActivity","Hizo click")
            val correo : String = mEteUsuarioCorreo!!.text.toString()
            val password : String = mEteUsuarioPassword!!.text.toString()

            if(correo == "pm@ulima.edu.pe" && password == "123"){
                mTviMensaje!!.text = "Login Correcto"
            }else{
                mTviMensaje!!.text = "Login Incorrecto"
            }
        }
    }
}