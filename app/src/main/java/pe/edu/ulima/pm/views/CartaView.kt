package pe.edu.ulima.pm.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import pe.edu.ulima.pm.R

class CartaView: View {
    val mPaint: Paint = Paint()
    var mSize: Float = 0f
    var mSizeII: Float = 0f
    var mWidth: Float = 0f
    var mHeight: Float = 0f
    var numero : String ?= null
    constructor(context: Context, num: String) : super(context) {
        //Crea una instancia a partir de XML
        numero =num

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
        mSizeII= Math.min(mWidth, mHeight).toFloat()
        setMeasuredDimension(mWidth.toInt(), mHeight.toInt())
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

        canvas!!.drawText("1",mSize/20F,mSizeII/4.1f,textoT)
        //numero BOT
        var textoB=Paint(Paint.ANTI_ALIAS_FLAG)
        textoB.color=Color.BLACK
        textoB.textSize=mSize/8f
        canvas!!.drawText("1",mSizeII/1.2f,mSizeII/0.9f,textoT)
        //simbolos
        var simbolo=Paint(Paint.ANTI_ALIAS_FLAG)
        simbolo.color=Color.BLACK
        simbolo.textSize=mSize/6f
        canvas!!.drawText("♠",mSizeII!!/3f,mSizeII!!/1.1f,simbolo)

    }

}