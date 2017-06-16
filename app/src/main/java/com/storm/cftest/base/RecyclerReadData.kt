package com.storm.cftest.base

import android.icu.text.TimeZoneFormat
import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * 作者：程峰 on 2017/6/5
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class RecyclerReadData(private var timeType: Int, var data: Read.DataBean?=null) : MultiItemEntity {
    companion object{
        val TOP = 1
        val READ = 2
        val BUTTOM=3
    }
    override fun getItemType(): Int {
        return timeType
    }
}