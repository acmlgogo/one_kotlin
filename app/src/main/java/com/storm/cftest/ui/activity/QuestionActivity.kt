package com.storm.cftest.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.FrameLayout
import android.widget.ImageView
import com.storm.cftest.R
import com.storm.cftest.adapter.CommentAdapter
import com.storm.cftest.base.Comment
import com.storm.cftest.base.Question
import com.storm.cftest.base.RecyclerCommentData
import com.storm.cftest.darger.OneModule
import com.storm.cftest.darger.QuestionModule
import com.storm.cftest.darger.component.DaggerOneComponent
import com.storm.cftest.darger.component.DaggerQuestionComponent
import com.storm.cftest.darger.component.OneComponent
import com.storm.cftest.toast
import com.storm.cftest.uitls.HtmlFmtUtil
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.layout_detail_comments.*
import kotlinx.android.synthetic.main.layout_detail_content.*
import javax.inject.Inject


/**
 * 作者：程峰 on 2017/6/12
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class QuestionActivity : BaseActivity() {
    @Inject
    lateinit var mObQuestion: Observable<Question>
    @Inject
    lateinit var mObComment: Observable<Comment>
    var adapter: CommentAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        initToolbar(toolbar, "问答")
        initIntentData()
        initview()
        updata()
    }

    private fun updata() {
        showLoading()
        DaggerQuestionComponent.builder().questionModule(QuestionModule(mItemID!!.toInt())).build().Inject(this)
        fetchQuestionData()
    }

    private fun fetchQuestionData() {
        mObQuestion.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onError = {
                            hiddenLoading()
                            showError(this)
                        },
                        onComplete = {
                            hiddenLoading()
                        },
                        onNext = {
                            parseQuestionData(it)
                        }
                )
    }

    private fun parseQuestionData(question: Question) {
        var mData = question.data
        tv_question_title.text = mData.question_title
        tv_question_content.text = mData.question_content
        tv_question_asker.text = mData.asker.user_name + "问道"
        webView.loadDataWithBaseURL("about:blank", HtmlFmtUtil.fmt(mData.answer_content), "text/html", "utf-8", null);
        tv_info.text = "${mData.charge_edt}"
        tv_copyright.text = "${mData.charge_email}"
        initadapter()
        fetchComment()
    }

    private fun initadapter() {
        adapter = CommentAdapter(null)
        rv_comments.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_comments.adapter = adapter
    }

    private fun fetchComment() {

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

    private fun parseComment(comment: Comment?) {
        var mComment = comment!!.data.data
        var mCommentList: MutableList<RecyclerCommentData> = ArrayList()

        for (i in mComment.indices) {
            mCommentList.add(RecyclerCommentData(RecyclerCommentData.NORMAL, mComment[i]))
        }
        loop@ for (i in mCommentList.indices) {
            if (mComment[i].type == 1 && i > 0) {
                mCommentList.add(i, RecyclerCommentData(RecyclerCommentData.HOT, null))
                break@loop
            }
        }
        adapter!!.setNewData(mCommentList)
    }

    private fun initview() {
        mLayoutLoading= findViewById(R.id.layout_loading) as FrameLayout
        mImg_load = findViewById(R.id.iv_loading) as ImageView

    }
}