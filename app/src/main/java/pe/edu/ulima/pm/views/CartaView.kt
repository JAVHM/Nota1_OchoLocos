package pe.edu.ulima.pm.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CartaView: View {
    val mPaint: Paint = Paint()
    var mSize: Float = 0f
    var mSizeII: Float = 0f
    var mWidth: Float = 0f
    var mHeight: Float = 0f
    var numero : String ?= null
    var simbolo: String? =null;
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
        mSize = Math.max(mWidth/2, mHeight/2).toFloat()
        //el minimo entre los dos
        mSizeII= Math.min(mWidth/2, mHeight/2)
//        setMeasuredDimension(mWidth.toInt(), mHeight.toInt())
        setMeasuredDimension(mSizeII!!.toInt(), (mSizeII!!*1.5f).toInt())
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        drawCarta(canvas!!)
        drawCaracteres(canvas!!)
    }

    private fun drawCarta(canvas: Canvas) {
        mPaint!!.color = Color.BLACK
        mPaint!!.style = Paint.Style.STROKE
        mPaint!!.setStrokeWidth(mSizeII!!/15f)
        canvas.drawRect(0f, mSize!!, mSizeII!!/1f, 0f, mPaint)

        //texto


    }

    private fun drawCaracteres(canvas: Canvas){
        //numeros TOP
        var textoT=Paint(Paint.ANTI_ALIAS_FLAG)
        textoT.color=Color.BLACK
        textoT.textSize=mSize/8f

        canvas!!.drawText(numero!!,mSize/20f,mSizeII/4.1f,textoT)
        //numero BOT
        var textoB=Paint(Paint.ANTI_ALIAS_FLAG)
        textoB.color=Color.BLACK
        textoB.textSize=mSize/8f
        canvas!!.drawText(numero!!,mSizeII/1.2f,mSize!!/1.1f,textoT)
        //simbolos
        var icono=Paint(Paint.ANTI_ALIAS_FLAG)
        icono.color=Color.BLACK
        icono.textSize=mSize/6f
        canvas!!.drawText(simbolo!!,mSizeII!!/3f,mSize!!/1.9f,icono)

    }

}