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
    private var mWidth: Float = 0f
    private var mHeight: Float = 0f

    private lateinit var mListener: (v: View) -> Unit


    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        //Crea una instancia a partir de XML


    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        mWidth = View.MeasureSpec.getSize(widthMeasureSpec).toFloat()
        mHeight = View.MeasureSpec.getSize(heightMeasureSpec).toFloat()
        mSize = Math.max(mWidth, mHeight).toFloat()
        setMeasuredDimension(mWidth.toInt(), mHeight.toInt())
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        drawCarta(canvas!!)
        drawCartaContorno(canvas!!)
    }

    private fun drawCarta(canvas: Canvas) {
        mPaint.color = Color.BLACK
        mPaint.style = Paint.Style.FILL

        canvas.drawRect(0f, mSize!!, mSize!!, 0f, mPaint)

    }

    private fun drawCartaContorno(canvas: Canvas) {
        mPaint.color = Color.WHITE
        mPaint.style = Paint.Style.FILL

        canvas.drawRect(100f, 4610f, 3800f, 100f, mPaint)

    }
}