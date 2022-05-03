package pe.edu.ulima.pm.views

import android.content.Context
import android.graphics.*
import android.view.View
import pe.edu.ulima.pm.R

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
        setMeasuredDimension(size!!, (size!!*1f).toInt())
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawFondo(canvas)
        drawBorde(canvas)
        drawCarta(canvas)
    }
    fun drawCarta(canvas: Canvas?) {

    }

    fun drawFondo(canvas: Canvas?) {
        var color= Color.argb(255,255,255,255)
        canvas?.drawColor(color)

    }

    fun drawBorde(canvas: Canvas?) {
        paint!!.color = Color.BLACK
        paint!!.style = Paint.Style.STROKE
        paint!!.setStrokeWidth(size!!/20f)
        canvas!!.drawRect(Rect(1, size!!, size!!, 0),paint!!)
    }
}