package com.storm.cftest.ui.activity

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView

import com.storm.cftest.R
import com.storm.cftest.ui.dialog.ErrorDialog
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 作者：程峰 on 2017/5/31
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
open class BaseActivity : AppCompatActivity() {
    protected var mItemID: String? = null
    protected var mImg_load: ImageView? = null
    protected var mLayoutLoading :FrameLayout ?=null
    protected fun initToolbar(toolbar: Toolbar, text: String) {
        setSupportActionBar(toolbar)
        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)
        actionBar?.setDisplayUseLogoEnabled(true)
        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.title = text
    }

    protected fun initIntentData() {
        mItemID = intent.getStringExtra("item_id")
        Log.e("CH", "read ${mItemID}")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.share_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return true
    }
    protected fun showLoading() {
        mLayoutLoading!!.visibility=View.VISIBLE
        (mImg_load!!.getDrawable() as AnimationDrawable).start()
        mImg_load!!.setVisibility(View.VISIBLE)
    }

    protected fun hiddenLoading() {
        mLayoutLoading!!.visibility=View.GONE
        mImg_load!!.setVisibility(View.GONE)
    }

    protected fun showError(context: Context) {
        ErrorDialog(context).show()
    }
}