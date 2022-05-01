package pe.edu.ulima.pm.views

import android.content.Context
import android.content.pm.Attribution
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import pe.edu.ulima.pm.R

class ULFaceView : View {
    private val mPaint : Paint = Paint()
    private var mSize : Float = 0f
    private var mWidth : Float = 0f
    private var mHeight : Float = 0f
    private var mColorCara : Int = Color.YELLOW

    private lateinit var mListener: (v : View) -> Unit

    public var mBocaHeight : Float = 0f

    /*constructor(context : Context) : super(context){
        //Crea una instancia pero a partir solo de Kotlin
    }*/
    constructor(context: Context, attrs : AttributeSet) : super(context, attrs){
        //Crea una instancia a partir de XML

        val a : TypedArray = context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ULFaceView,
            0,
            0
        )
        mColorCara = a.getColor(R.styleable.ULFaceView_colorCara, Color.YELLOW)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        mWidth = View.MeasureSpec.getSize(widthMeasureSpec).toFloat()
        mHeight = View.MeasureSpec.getSize(heightMeasureSpec).toFloat()

        mSize = Math.min(mWidth, mHeight).toFloat()
        mBocaHeight = mSize / 8f

        setMeasuredDimension(mWidth.toInt(), mHeight.toInt())
    }
    override fun onDraw(canvas: Canvas?){
        super.onDraw(canvas)
        drawCara(canvas!!)
        drawOjos(canvas!!)
        drawBoca(canvas!!)
    }
    private fun drawCara(canvas : Canvas){
        mPaint.color = Color.YELLOW
        mPaint.style = Paint.Style.FILL

        canvas.drawCircle(
            mWidth/2f,
            mHeight/2,
            mSize/2,
            mPaint)
    }
    private fun drawOjos(canvas: Canvas){
        mPaint.color = Color.BLACK
        mPaint.style = Paint.Style.FILL

        val eyeWidth = mSize/6f

        //Izquierdo
        canvas.drawCircle(
            mSize/4f,
            mHeight/2f - mSize/4f,
            eyeWidth/2f,
            mPaint)

        //Derecho
        canvas.drawCircle(
            mWidth - mSize / 4f,
            mHeight/2f - mSize/4f,
            eyeWidth/2f,
            mPaint)
    }
    private fun drawBoca(canvas: Canvas){
        mPaint.color = Color.BLACK
        mPaint.style = Paint.Style.FILL

        val bocaWidth = mSize / 2f

        val rectBoca = RectF(
            mWidth/2f-bocaWidth/2f,
            mHeight/2f+mSize/6f,
            mWidth/2f+bocaWidth/2f,
            mHeight/2f + mSize/6 + mBocaHeight
        )
        canvas.drawOval(rectBoca, mPaint)
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