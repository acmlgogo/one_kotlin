package com.storm.cftest.ui.fragment

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.storm.cftest.R
import com.storm.cftest.adapter.ReadAdapter
import com.storm.cftest.base.Read
import com.storm.cftest.base.RecyclerReadData
import com.storm.cftest.darger.ReadModule
import com.storm.cftest.darger.component.DaggerReadComponent

import com.xyz.leeeyou.zhihuribao.view.fragment.BaseFragment
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class ReadFregment : BaseFragment() {

    private var mRecyclerView: RecyclerView? = null
    private var mReadAdapter: ReadAdapter? = null
    private var mposition: Int = 0


    private var mActivity: AppCompatActivity? = null
    @Inject
    lateinit var mReadOb: Observable<Read>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var mView = inflater!!.inflate(R.layout.fragment_read_layout, null)
        mRecyclerView = mView!!.findViewById(R.id.read_recycler) as RecyclerView
        mRecyclerView!!.layoutManager=LinearLayoutManager(mActivity, LinearLayoutManager.VERTICAL, false)
        mImg_load = mView.findViewById(R.id.img_load) as ImageView
        return mView
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        mActivity = activity as AppCompatActivity
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initadapter()
        updateData()
    }

    fun initadapter() {
        mReadAdapter = ReadAdapter(null)
        mReadAdapter!!.setEnableLoadMore(true)
        mReadAdapter!!.removeAllFooterView()
        mReadAdapter!!.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        mRecyclerView!!.adapter = mReadAdapter
    }

    override fun checkCanDoRefresh(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateData() {
        showLoading()
        loadReaddata();
    }
    fun loadReaddata(){
        DaggerReadComponent.builder().readModule(ReadModule()).build().Inject(this)
        fetchReadList();
    }
    private fun fetchReadList() {
        mReadOb.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            var readlist = parseReadData(it)
                            mReadAdapter?.setNewData(readlist)
                        },
                        onComplete = {
                                    hiddenLoading()
                        },
                        onError = {
                                hiddenLoading()
                        }
                )
    }

    private fun parseReadData(data: Read?): MutableList<RecyclerReadData> {
        val listdata: MutableList<RecyclerReadData> = ArrayList<RecyclerReadData>()
        var cData = data!!.data
        if (mposition == 0) {
            listdata.add(RecyclerReadData(RecyclerReadData.TOP, null))
        }
        for (i in cData.indices) {
            listdata.add(RecyclerReadData(RecyclerReadData.READ, cData[i]))
            listdata.add(RecyclerReadData(RecyclerReadData.BUTTOM, null))
        }

        return listdata;
    }
}