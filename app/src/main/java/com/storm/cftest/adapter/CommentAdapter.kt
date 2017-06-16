package com.storm.cftest.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.storm.cftest.R
import com.storm.cftest.base.Comment
import com.storm.cftest.base.RecyclerCommentData
import org.w3c.dom.Text
import java.math.MathContext

/**
 * 作者：程峰 on 2017/6/8
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class CommentAdapter(data : MutableList<RecyclerCommentData>?) : BaseMultiItemQuickAdapter<RecyclerCommentData,BaseViewHolder>(data){
    init {
        addItemType(RecyclerCommentData.HOT, R.layout.layout_hot_decoration)
        addItemType(RecyclerCommentData.NORMAL,R.layout.item_rv_commet)
    }
    override fun convert(helper: BaseViewHolder?, item: RecyclerCommentData?) {
        when(item!!.itemType){
            RecyclerCommentData.NORMAL ->{
                var data= item.commentData
                    Glide.with(mContext).load(data!!.user.web_url).into(helper!!.getView(R.id.iv_user))
                helper.setText(R.id.tv_username,data.user.user_name)
                        .setText(R.id.tv_time,data.input_date)
                        .setText(R.id.tv_content,data.content)
                        .setText(R.id.tv_laud_num,"${data.praisenum}")
                if (TextUtils.isEmpty(data.quote)) {
                    helper.getView<LinearLayout>(R.id.ll_to_user).visibility=View.GONE
                }else{
                    helper.setText(R.id.tv_to_user_content,data.quote)
                            .setText(R.id.tv_to_user_username,data.touser.user_name)
                }

            }
        }
    }

}