package com.storm.cftest.base

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * 作者：程峰 on 2017/6/6
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class RecyclerMovieData(val itmetype: Int, var data: Movie.DataBean?) : MultiItemEntity {
    companion object {
        val TOP = 1
        val MOVIE = 2
        val BUTTOM = 3
    }

    override fun getItemType(): Int {
        return itmetype
    }
}