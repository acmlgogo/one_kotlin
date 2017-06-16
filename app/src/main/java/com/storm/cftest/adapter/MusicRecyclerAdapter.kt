package com.storm.cftest.adapter

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.storm.cftest.R
import com.storm.cftest.base.RecyclerMusicData

/**
 * 作者：程峰 on 2017/6/1
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class MusicRecyclerAdapter(data: MutableList<RecyclerMusicData>?) : BaseMultiItemQuickAdapter<RecyclerMusicData, BaseViewHolder>(data) {
    init {
        addItemType(RecyclerMusicData.TOP, R.layout.item_music_index_top)
        addItemType(RecyclerMusicData.MUSIC, R.layout.music_item)
        addItemType(RecyclerMusicData.BUTTOM, R.layout.item_music_index_buttom)
    }

    override fun convert(helper: BaseViewHolder, item: RecyclerMusicData) {
        when (item.itemType) {
            RecyclerMusicData.MUSIC -> {
                Glide.with(mContext).load(item.musicitem!!.img_url).into(helper.getView(R.id.music_img))
                helper.setText(R.id.tv_title, item.musicitem!!.forward)
                        .setText(R.id.tv_author_name, "文/${item.musicitem!!.author.user_name}")
                        .setText(R.id.tv_music_author, item.musicitem.audio_author)
                        .setText(R.id.tv_like_count, "${item.musicitem.like_count}")
            }
        }
    }
}