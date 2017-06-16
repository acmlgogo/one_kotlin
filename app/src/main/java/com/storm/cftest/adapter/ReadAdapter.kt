package com.storm.cftest.adapter

import android.content.Intent
import android.util.Log
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.storm.cftest.R
import com.storm.cftest.base.Read
import com.storm.cftest.base.RecyclerReadData
import com.storm.cftest.ui.activity.ReadActivity

/**
 * 作者：程峰 on 2017/6/5
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class ReadAdapter(data: MutableList<RecyclerReadData>?) : BaseMultiItemQuickAdapter<RecyclerReadData, BaseViewHolder>(data) {

    init {

        addItemType(RecyclerReadData.READ, R.layout.item_read_main)
        addItemType(RecyclerReadData.TOP, R.layout.item_music_index_top)
        addItemType(RecyclerReadData.BUTTOM, R.layout.itme_read_buttom)
    }

    override fun convert(helper: BaseViewHolder?, item: RecyclerReadData) {
        when (item.itemType) {
            RecyclerReadData.READ -> {
                Log.e("CH", "convert")
                Glide.with(mContext).load(item.data!!.img_url).into(helper!!.getView(R.id.read_img))
                helper!!.setText(R.id.tv_title, item.data!!.title)
                        .setText(R.id.tv_author_name, "文/${item.data!!.author.user_name}")
                        .setText(R.id.tv_content, item.data!!.forward.trim())
                        .setText(R.id.tv_like, "${item.data!!.like_count}个赞")
                        .setText(R.id.tv_edit, item.data!!.last_update_date)
                        .setOnClickListener(R.id.read, {
                            v ->
                                var intent = Intent()
                                intent.setClass(mContext,ReadActivity::class.java)
                                intent.putExtra("item_id",item.data!!.content_id)
                                mContext.startActivity(intent)
                        })
            }

        }
    }
}