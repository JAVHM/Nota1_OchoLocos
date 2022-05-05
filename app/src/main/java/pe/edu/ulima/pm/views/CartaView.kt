package pe.edu.ulima.pm.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class CartaView: View {
    val mPaint: Paint = Paint()
    var mSize: Float = 0f
    var mSizeII: Float = 0f
    var mWidth: Float = 0f
    var mHeight: Float = 0f
    var numero : String ?= null
    var simbolo: String? =null;

    private lateinit var mListener: (v : View) -> Unit

    constructor(context: Context, num: String, simb: String) : super(context) {
        //Crea una instancia a partir de XML
        numero =num
        simbolo=simb
    }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        //Crea una instancia a partir de XML


    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        //ancho del cel
        mWidth = View.MeasureSpec.getSize(widthMeasureSpec).toFloat()
        //alto de cel
        mHeight = View.MeasureSpec.getSize(heightMeasureSpec).toFloat()
        //el maximo entre los dos
        mSize = Math.max(mWidth, mHeight).toFloat()
        //el minimo entre los dos
        mSizeII= Math.min(mWidth, mHeight)
//        setMeasuredDimension(mWidth.toInt(), mHeight.toInt())
        setMeasuredDimension((mSizeII!!*1F).toInt(), (mSizeII!!*1f).toInt())
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        drawCarta(canvas!!)
        drawCaracteres(canvas!!)
    }

    private fun drawCarta(canvas: Canvas) {
        mPaint!!.color = Color.BLACK
        mPaint!!.style = Paint.Style.STROKE
        mPaint!!.setStrokeWidth(mSizeII!!/12f)
        canvas.drawRect(0f, mSizeII!!, mSizeII, 0f, mPaint)

    }

    private fun drawCaracteres(canvas: Canvas){
        //numeros TOP
        var simb=simbolo!!
        val colorPalo: Paint = Paint()
        var negro=Color.BLACK;
        var rojo=Color.RED;

        if(simb=="corazon"){
            simb="♥"
            colorPalo.color=Color.RED;
        }else if(simb=="espada"){
            simb="♠"
            colorPalo.color=Color.BLACK;
        }else if(simb=="trebol"){
            simb="♣"
            colorPalo.color=Color.BLACK;
        }else if(simb=="diamante"){
            simb="♦"
            colorPalo.color=Color.RED;
        }
        var textoT=Paint(Paint.ANTI_ALIAS_FLAG)
        textoT.color=Color.BLACK
        textoT.textSize=60f


        canvas!!.drawText(numero!!,15f,90f,textoT)
        //numero BOT
        var textoB=Paint(Paint.ANTI_ALIAS_FLAG)
        textoB.color=Color.BLACK
        textoB.textSize=60f
        canvas!!.drawText(numero!!,180f,220f,textoB)
        //simbolos
        var icono=Paint(Paint.ANTI_ALIAS_FLAG)
        icono.textSize=100f
        icono.textAlign=Paint.Align.CENTER
        val xPos = (canvas.width / 2)
        val yPos = (canvas.height / 2 - (icono.descent() + icono.ascent()) / 2)

        canvas!!.drawText(simb!!,xPos.toFloat(),yPos.toFloat(),icono)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if(mListener != null){
            mListener(this)
            invalidate()
        }
        return super.onTouchEvent(event)
    }
    fun  setOnClickListener(listener : (v : View) -> Unit){
        mListener = listener
    }
}