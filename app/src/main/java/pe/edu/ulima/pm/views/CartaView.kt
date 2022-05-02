package pe.edu.ulima.pm.views

import android.content.Context
import android.graphics.*
import android.view.View

class CartaView: View {
    var size : Int? = null
    var paint : Paint? = null
    var numero : String ?= null

    constructor(context : Context, num : String) : super(context) {
        numero = num
        paint = Paint()
    }
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val width = View.MeasureSpec.getSize(widthMeasureSpec)
        val height = View.MeasureSpec.getSize(heightMeasureSpec)
        size = Math.min(width, height)
        setMeasuredDimension(size!!, (size!!*1.5f).toInt())
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawFondo(canvas)
        drawBorde(canvas)
        drawCarta(canvas)
    }
    fun drawCarta(canvas: Canvas?) {
        //PARA EL TEXTO --> en vez de paint , la variable text para el color de carta size etc
        var text = Paint(Paint.ANTI_ALIAS_FLAG)
        text.color = Color.BLACK
        text.textSize = size!!/4f
        //DRAWtEXT PARA EL TEXTO
        //dropLast : (1) para que bote el ultimo numero que representa el tipo de carta

        canvas!!.drawText(numero!!.dropLast(1),size!!/15f,size!!/4f,text)
    }

    fun drawFondo(canvas: Canvas?) {
        var color= Color.argb(255,255,255,255)
        canvas?.drawColor(color)

    }

    fun drawBorde(canvas: Canvas?) {
        paint!!.color = Color.BLACK
        paint!!.style = Paint.Style.STROKE
        paint!!.setStrokeWidth(size!!/15f)
        canvas!!.drawRect(Rect(0, size!!, size!!, 0),paint!!)
    }
}