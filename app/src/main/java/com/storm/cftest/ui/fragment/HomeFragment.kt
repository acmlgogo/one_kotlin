package com.storm.cftest.ui.fragment

import android.app.Activity
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.storm.cftest.R
import com.storm.cftest.adapter.OneRecyclerAdapter
import com.storm.cftest.base.One
import com.storm.cftest.base.OneID
import com.storm.cftest.base.RecyclerOneData
import com.storm.cftest.darger.OneModule
import com.storm.cftest.darger.component.DaggerOneComponent
import com.storm.cftest.ui.activity.BaseActivity


import com.xyz.leeeyou.zhihuribao.view.fragment.BaseFragment
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.ArrayList
import javax.inject.Inject

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class HomeFragment : BaseFragment() {
    @Inject
    lateinit var mIdOneObserveable: Observable<OneID>
    @Inject
    lateinit var mListOneObserveable: Observable<One>

    lateinit var mOneIDStrList: List<String>

    var home_recyclerview: RecyclerView? = null
    var mOneID: OneID? = null
    var mActivity: AppCompatActivity? = null
    var mIndexAdapter: OneRecyclerAdapter? = null

    var mPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_home, null)
        home_recyclerview = view.findViewById(R.id.home_recyclerview) as RecyclerView
        home_recyclerview!!.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        mImg_load = view.findViewById(R.id.img_load) as ImageView
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initAdapter();
        updateData()
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        mActivity = activity as AppCompatActivity
    }

    private fun initAdapter() {
        mIndexAdapter = OneRecyclerAdapter(null)
        mIndexAdapter?.setEnableLoadMore(true)
//        mIndexAdapter?.removeAllFooterView()
        mIndexAdapter?.setOnLoadMoreListener {
            Log.e("CH", "加载更多")
            if (mPosition < mOneIDStrList!!.size - 1) {
                loadIndexData(++mPosition)
            }
        }
        mIndexAdapter?.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        home_recyclerview!!.adapter = mIndexAdapter

    }

    override fun checkCanDoRefresh(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

//  override fun updateData() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//  }


    private fun loadIndexData(position: Int) {
        DaggerOneComponent.builder().oneModule(OneModule(mOneIDStrList[position].toInt())).build().Inject(this)
        Log.e("CH", "首页数据ID${mOneIDStrList[position].toInt()}")
        fetchOnelist()
    }

    fun fetchOneID() {
        mIdOneObserveable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            oneID ->
                            mOneID = oneID
                            mOneIDStrList = oneID.data
                            loadIndexData(mPosition)
                        },
                        onComplete = {
                        },
                        onError = {

                            throwable ->
                            Log.e("CH", "homeFragment fetchOneID ${throwable.toString()}")
                            hiddenLoading()
                            showError(mActivity!!)
                        }
                )
    }

    fun fetchOnelist() {
        mListOneObserveable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            val indexData = parseIndexData(it)
                            val isPullToRefresh = mPosition == 0
                            if (isPullToRefresh) {
                                mIndexAdapter?.setNewData(indexData)
                            } else {
                                mIndexAdapter?.addData(indexData)
                                mIndexAdapter?.loadMoreComplete()
                            }
                        },
                        onError = {

                            it.printStackTrace()
                            hiddenLoading()
                            showError(mActivity!!)
                        },

                        onComplete = {

                            hiddenLoading()

                        }

                )

    }

    private fun parseIndexData(index: One): MutableList<RecyclerOneData> {
        val tempDataList: MutableList<RecyclerOneData> = ArrayList()
        val isPullToRefresh = mPosition == 0
        if (isPullToRefresh) {
            tempDataList.add(RecyclerOneData(RecyclerOneData.WEATHER, null, index.data.weather))
        }
        val contentList = index.data.content_list
        for (i in contentList.indices) {
            tempDataList.add(RecyclerOneData(if (i == 0) RecyclerOneData.TOP else RecyclerOneData.READ, contentList[i], null))
            tempDataList.add(RecyclerOneData(RecyclerOneData.BLANK, null, null))
        }
        val isLoadMoreEnd = mPosition == mOneIDStrList!!.size - 1
        if (isLoadMoreEnd) {
//          loadMoreEnd()
        }
        return tempDataList
    }

    override fun updateData() {

        showLoading()


        DaggerOneComponent.builder().oneModule(OneModule()).build().Inject(this)

        fetchOneID()

    }


//    private fun loadMoreEnd() {
//        mIndexAdapter?.loadMoreEnd()
//        mIndexAdapter?.setEnableLoadMore(false)
//        if (mNoMoreDataView == null) {
//            mNoMoreDataView = LayoutInflater.from(context).inflate(R.layout.not_loading, null, false)
//        }
//        mIndexAdapter?.addFooterView(mNoMoreDataView)
//    }
}