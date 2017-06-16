package com.xyz.leeeyou.zhihuribao.view.fragment

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.storm.cftest.R
import com.storm.cftest.ui.dialog.ErrorDialog
import kotlinx.android.synthetic.main.app_bar_main.*

/**
 * Created by 程峰 on 2017/4/26.
 */
abstract class BaseFragment : Fragment() {
    protected var mImg_load: ImageView? = null
    abstract fun checkCanDoRefresh(): Boolean
    abstract fun updateData()
    protected fun showLoading() {
        (mImg_load!!.getDrawable() as AnimationDrawable).start()
        mImg_load!!.setVisibility(View.VISIBLE)
    }

    protected fun hiddenLoading() {
        mImg_load!!.setVisibility(View.GONE)
    }

    protected fun showError(context: Context) {
        ErrorDialog(context).show()
    }
}