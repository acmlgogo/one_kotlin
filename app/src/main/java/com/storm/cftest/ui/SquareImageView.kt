package com.storm.cftest.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView

/**
 * 作者：程峰 on 2017/5/31
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */

class SquareImageView : ImageView {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(measuredWidth, measuredWidth)
    }
}
