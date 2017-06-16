package com.storm.cftest.adapter

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.storm.cftest.R

import com.storm.cftest.base.RecyclerMovieData

/**
 * 作者：程峰 on 2017/6/6
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class MovieRecyclerAdapter(data: MutableList<RecyclerMovieData>?) : BaseMultiItemQuickAdapter<RecyclerMovieData, BaseViewHolder>(data) {
    init {
        addItemType(RecyclerMovieData.MOVIE, R.layout.item_movie_main)

        addItemType(RecyclerMovieData.BUTTOM, R.layout.item_movie_buttom)
    }

    override fun convert(helper: BaseViewHolder?, item: RecyclerMovieData?) {
        when (item!!.itemType) {
            RecyclerMovieData.MOVIE -> {
                Glide.with(mContext).load(item.data!!.img_url).into(helper!!.getView(R.id.movie_img))
                helper.setText(R.id.tv_title, item.data!!.title)
                helper.setText(R.id.tv_author_name, "文/${item.data!!.author.user_name}")
                helper.setText(R.id.tv_content, item.data!!.forward)
                helper.setText(R.id.tv_like, "${item.data!!.like_count}赞")
            }
        }
    }
}