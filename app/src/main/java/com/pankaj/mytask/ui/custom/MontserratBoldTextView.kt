package com.pankaj.mytask.ui.custom

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MontserratBoldTextView : AppCompatTextView {

    constructor(context: Context) : super(context){
        setTypeFace()
    }

    constructor(context: Context, attrs : AttributeSet) : super(context,attrs){
        setTypeFace()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr : Int) : super(context, attrs, defStyleAttr){
        setTypeFace()
    }

    fun setTypeFace() {
        val typeface = Typeface.createFromAsset(context.assets, "font/MontserratBold.otf")
        setTypeface(typeface)
    }
}