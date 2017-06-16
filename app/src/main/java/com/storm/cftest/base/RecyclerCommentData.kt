package com.storm.cftest.base

import com.chad.library.adapter.base.entity.MultiItemEntity

/**
 * 作者：程峰 on 2017/6/8
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class RecyclerCommentData(private var itemType: Int,var commentData: Comment.DataBeanX.DataBean?) : MultiItemEntity {
    companion object {
        var HOT = 1
        var NORMAL = 2
    }

    override fun getItemType(): Int {
        return itemType
    }
}