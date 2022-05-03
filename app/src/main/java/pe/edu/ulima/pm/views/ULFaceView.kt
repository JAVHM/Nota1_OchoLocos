package pe.edu.ulima.pm.views

import android.content.Context
import android.content.pm.Attribution
import android.content.res.TypedArray
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import pe.edu.ulima.pm.R

class ULFaceView : View {
    private val mPaint: Paint = Paint()
    private var mSize: Float = 0f
    private var mSizeII: Float = 0f
    private var mWidth: Float = 0f
    private var mHeight: Float = 0f

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
        mPaint!!.setStrokeWidth(mSizeII!!/20f)
        canvas.drawRect(0f, mSize!!, mSizeII!!/1f, 0f, mPaint)

        //texto


    }

    private fun drawCaracteres(canvas: Canvas){
        //numeros TOP
        var textoT=Paint(Paint.ANTI_ALIAS_FLAG)
        textoT.color=Color.BLACK
        textoT.textSize=900f

        canvas!!.drawText("1",mSize/20F,mSizeII/4.1f,textoT)
        //numero BOT
        var textoB=Paint(Paint.ANTI_ALIAS_FLAG)
        textoB.color=Color.BLACK
        textoB.textSize=900f
        canvas!!.drawText("1",mSizeII/1.2f,mSizeII/0.9f,textoT)
        //simbolos
        var simbolo=Paint(Paint.ANTI_ALIAS_FLAG)
        simbolo.color=Color.BLACK
        simbolo.textSize=1000f
        canvas!!.drawText("♠",mSizeII!!/3f,mSizeII!!/1.5f,simbolo)

    }

}