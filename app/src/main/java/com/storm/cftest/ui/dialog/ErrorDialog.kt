package com.storm.cftest.ui.dialog

import android.content.Context
import android.os.Bundle
import com.storm.cftest.R

/**
 * 作者：程峰 on 2017/6/12
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class ErrorDialog(context: Context) : BaseDialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.errordialog_layout)
    }

}