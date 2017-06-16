package com.storm.cftest.adapter

import android.content.Intent
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.storm.cftest.R
import com.storm.cftest.base.One
import com.storm.cftest.base.RecyclerOneData
import com.storm.cftest.ui.activity.QuestionActivity
import com.storm.cftest.ui.activity.ReadActivity

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class OneRecyclerAdapter(data: MutableList<RecyclerOneData>?) : BaseMultiItemQuickAdapter<RecyclerOneData, BaseViewHolder>(data) {
    init {
        addItemType(RecyclerOneData.BLANK, R.layout.item_one_index_blank)
        addItemType(RecyclerOneData.WEATHER, R.layout.item_one_index_weather)
        addItemType(RecyclerOneData.TOP, R.layout.item_one_index_top)
        addItemType(RecyclerOneData.READ, R.layout.item_one_index_read)
    }

    override fun convert(helper: BaseViewHolder, item: RecyclerOneData) {

        when (item.itemType) {
            RecyclerOneData.WEATHER -> {
                helper.setText(R.id.tv_date, item.weatherBean?.date)
                        .setText(R.id.tv_climate, item.weatherBean?.climate + "，" + item.weatherBean?.city_name)

            }
            RecyclerOneData.TOP -> {
                Glide.with(mContext).load(item.contentlistBean?.img_url).into(helper.getView(R.id.img))
                helper.setText(R.id.tv_author, item.contentlistBean?.title + " | " + item.contentlistBean?.pic_info)
                        .setText(R.id.tv_forward, item.contentlistBean?.forward)
                        .setText(R.id.tv_words_info, item.contentlistBean?.words_info)
                        .setText(R.id.tv_like, item.contentlistBean?.like_count.toString() + "个赞")
                        .setOnClickListener(R.id.tv_share) {}
                        .setOnClickListener(R.id.rl_item_one_index_top) {}
            }
            RecyclerOneData.READ -> {
                Glide.with(mContext).load(item.contentlistBean?.img_url).into(helper.getView(R.id.img))
                helper.setText(R.id.tv_title, item.contentlistBean?.title)
                        .setText(R.id.tv_author_name, "文/" + item.contentlistBean!!.author.user_name)
                        .setText(R.id.tv_forward, item.contentlistBean?.forward)
                        .setText(R.id.tv_like, item.contentlistBean?.like_count.toString() + "个赞")
                        .setOnClickListener(R.id.tv_share) {

                        }

                if (item.contentlistBean.tag_list.size !== 0) {
                    helper.setText(R.id.tv_climate, "${item.contentlistBean.tag_list[0].title}")
                } else {
                    when (item.contentlistBean.content_type) {
                        "6" -> helper.setText(R.id.tv_climate, "- -")
                                .setOnClickListener(R.id.rl_item_one_index_read) {

                                }
                        "1" -> helper.setText(R.id.tv_climate, "阅读")
                                .setOnClickListener(R.id.rl_item_one_index_read) {
                                    var intent = Intent(mContext, ReadActivity::class.java)
                                    intent.putExtra("item_id", item.contentlistBean.item_id)
                                    mContext.startActivity(intent)
                                }
                        "2" -> helper.setText(R.id.tv_climate, "连载")
                                .setOnClickListener(R.id.rl_item_one_index_read) {

                                }
                        "3" -> helper.setText(R.id.tv_climate, "问答")
                                .setOnClickListener(R.id.rl_item_one_index_read) {
                                    var intent = Intent(mContext, QuestionActivity::class.java)
                                    intent.putExtra("item_id", item.contentlistBean.item_id)
                                    mContext.startActivity(intent)
                                }
                        "4" -> helper.setText(R.id.tv_climate, "音乐")
                                .setOnClickListener(R.id.rl_item_one_index_read) {

                                }
                        "5" -> helper.setText(R.id.tv_climate, "影视")
                                .setOnClickListener(R.id.rl_item_one_index_read) {

                                }
                    }
                }
            }
        /**
         *  * 0 one day
         * 1 read 软糖漫画
         * 2 连载
         * 3 问答
         * 4 音乐
         * 5 影视*/
        }
    }
}