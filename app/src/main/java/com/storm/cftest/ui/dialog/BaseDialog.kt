package com.storm.cftest.ui.dialog

import android.content.Context
import android.content.DialogInterface

import android.support.v7.app.AlertDialog

/**
 * 作者：程峰 on 2017/6/12
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
open class BaseDialog : AlertDialog {
    constructor(context: Context) :super(context)
    constructor(context: Context, themeResId:Int):super(context,themeResId)
    constructor(context: Context, cancelable:Boolean, cancelListener: DialogInterface.OnCancelListener):super(context,cancelable,cancelListener)

}