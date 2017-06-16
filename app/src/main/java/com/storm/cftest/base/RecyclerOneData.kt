package com.storm.cftest.base

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class RecyclerOneData ( private var itemType:Int,val contentlistBean:One.DataBean.ContentListBean?=null,val weatherBean: One.DataBean.WeatherBean?=null): MultiItemEntity {
    companion object{
        val BLANK = -1
        val WEATHER = 0
        val TOP = 1
        val READ = 2
    }
    override fun getItemType(): Int {
        return itemType
    }

}