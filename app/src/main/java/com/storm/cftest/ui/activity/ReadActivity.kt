package com.storm.cftest.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import com.storm.cftest.R
import com.storm.cftest.adapter.CommentAdapter
import com.storm.cftest.base.Comment
import com.storm.cftest.base.ReadDetails
import com.storm.cftest.base.RecyclerCommentData
import com.storm.cftest.darger.OneModule
import com.storm.cftest.darger.ReadModule
import com.storm.cftest.darger.component.DaggerOneComponent
import com.storm.cftest.darger.component.DaggerReadComponent
import com.storm.cftest.uitls.HtmlFmtUtil
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.layout_detail_comments.*
import kotlinx.android.synthetic.main.layout_detail_content.*
import kotlinx.android.synthetic.main.layout_detail_head.*
import kotlinx.android.synthetic.main.read_activity_layout.*
import javax.inject.Inject

/**
 * 作者：程峰 on 2017/6/8
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class ReadActivity : BaseActivity() {

    var mAdapter: CommentAdapter? = null
    @Inject
    lateinit var mObReadDetails: Observable<ReadDetails>
    @Inject
    lateinit var mObComment: Observable<Comment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read_activity_layout)
        initIntentData()
        initview()
        updata()
    }

    private fun updata() {
        showLoading()
        DaggerReadComponent.builder().readModule(ReadModule(mItemID!!.toInt())).build().Inject(this)
        fetchReadDetailsData()
    }

    private fun fetchReadDetailsData() {
        mObReadDetails.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onError = {

                        },
                        onComplete = {
                            hiddenLoading()
                        },
                        onNext = {
                            parseReadDetails(it)
                        }
                )

    }

    private fun parseReadDetails(data: ReadDetails) {
        var mData = data.data
        webView.loadDataWithBaseURL("about:blank", HtmlFmtUtil.fmt(mData.hp_content), "text/html", "utf-8", null)
        tv_title.text = "${mData.hp_title}"
        tv_author.text = "文/${mData.hp_author}"
        tv_info.text = "${mData.hp_author_introduce}"
        tv_copyright.text = "${mData.copyright}"
        authors.setAuthors(mData.author)
        fetchCommentData()
    }

    fun parseComment(data: Comment) {
        var mComment = data.data.data
        var mCommentList: MutableList<RecyclerCommentData> = ArrayList()

     for (i in mComment.indices) {
                mCommentList.add(RecyclerCommentData(RecyclerCommentData.NORMAL, mComment[i]))
        }
        loop@ for (i in mCommentList.indices) {
            if (mComment[i].type==1&&i>0) {
                mCommentList.add(i,RecyclerCommentData(RecyclerCommentData.HOT, null))
                break@loop
            }
        }
        mAdapter!!.setNewData(mCommentList)

    }

    private fun fetchCommentData() {
        mObComment.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            parseComment(it)
                        },
                        onComplete = {
                        },
                        onError = {
                        }
                )
    }


    private fun initview() {
        mLayoutLoading= findViewById(R.id.layout_loading) as FrameLayout
        mImg_load = findViewById(R.id.iv_loading) as ImageView
        initToolbar(toolbar,"阅读")
        rv_comments.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        mAdapter = CommentAdapter(null)
        rv_comments.adapter = mAdapter
        rv_comments. setNestedScrollingEnabled(false)
    }




}