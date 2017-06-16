package com.storm.cftest.base

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * 作者：程峰 on 2017/6/1
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class RecyclerMusicData(private var itemType:Int, val musicitem:Music.DataBean?=null) :MultiItemEntity {
    companion object{

        val TOP = 1
        val MUSIC = 2
        val BUTTOM=3
    }
    override fun getItemType(): Int {
        return itemType
    }
}