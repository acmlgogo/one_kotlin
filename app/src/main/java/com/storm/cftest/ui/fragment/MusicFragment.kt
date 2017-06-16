package com.storm.cftest.ui.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.animation.BaseAnimation
import com.sothree.slidinguppanel.SlidingUpPanelLayout

import com.storm.cftest.R
import com.storm.cftest.adapter.MusicRecyclerAdapter
import com.storm.cftest.base.Music
import com.storm.cftest.base.RecyclerMusicData
import com.storm.cftest.base.RecyclerOneData
import com.storm.cftest.darger.MusicModule
import com.storm.cftest.darger.OneModule
import com.storm.cftest.darger.component.DaggerMusicComponent
import com.storm.cftest.darger.component.DaggerOneComponent
import com.storm.cftest.toast
import com.storm.cftest.ui.activity.BaseActivity
import com.xyz.leeeyou.zhihuribao.view.fragment.BaseFragment
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_music_layout.*
import kotlinx.android.synthetic.main.music_panel_card_layout.*
import javax.inject.Inject

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class MusicFragment : BaseFragment() {
    var mView: View? = null
    var mSlidinguppane: SlidingUpPanelLayout? = null
    var mTopContainer: RelativeLayout? = null
    var mPosition: Int = 0
    var adapter: MusicRecyclerAdapter? = null
    var mMusicRecyler: RecyclerView? = null
    var mContext: Context? = null
    var mActivity: AppCompatActivity? = null
    @Inject
    lateinit var mMusicObservable: Observable<Music>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        mActivity = activity as AppCompatActivity
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater!!.inflate(R.layout.fragment_music_layout, null)
        mImg_load = mView!!.findViewById(R.id.img_load) as ImageView
        initview()
        return mView

    }

    fun initview() {
        mTopContainer = mView!!.findViewById(R.id.topContainer) as RelativeLayout
        mSlidinguppane = mView!!.findViewById(R.id.slidinguppane) as SlidingUpPanelLayout
        mMusicRecyler = mView!!.findViewById(R.id.music_recyclerview) as RecyclerView
        mMusicRecyler!!.layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)
        setPanelSlideListeners(mSlidinguppane!!)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initAdapter();
        updateData()
    }

    private fun initAdapter() {
        adapter = MusicRecyclerAdapter(null)
        adapter!!.setEnableLoadMore(true)
        adapter!!.removeAllFooterView()

        adapter!!.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        mMusicRecyler!!.adapter = adapter
    }

    override fun checkCanDoRefresh(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateData() {
        showLoading()
        loadMusicData()
    }

    fun setPanelSlideListeners(panelLayout: SlidingUpPanelLayout) {
        panelLayout.addPanelSlideListener(object : SlidingUpPanelLayout.PanelSlideListener {
            override fun onPanelSlide(panel: View?, slideOffset: Float) {
//                mTopContainer!!.alpha = 1 - slideOffset
            }

            override fun onPanelStateChanged(panel: View?, previousState: SlidingUpPanelLayout.PanelState?, newState: SlidingUpPanelLayout.PanelState?) {
                Log.e("CH", "${previousState}")

            }

        })
    }


    private fun loadMusicData() {
        DaggerMusicComponent.builder().musicModule(MusicModule()).build().Inject(this)
        fetchMusiclist()
    }

    private fun fetchMusiclist() {
        mMusicObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onError = {
                            hiddenLoading()
                        },
                        onComplete = {
                            hiddenLoading()
                        },
                        onNext = {
                            musicData ->
                            var musicList = parseMusicData(musicData)
                            val isPullToRefresh = mPosition == 0
                            if (isPullToRefresh) {
                                adapter?.setNewData(musicList)
                            } else {
                                adapter?.addData(musicList)
                                adapter?.loadMoreComplete()
                            }
                        }
                )

    }

    fun parseMusicData(music: Music): MutableList<RecyclerMusicData> {
        val listMusic: MutableList<RecyclerMusicData> = ArrayList()
        val isPullToRefresh = mPosition == 0
        if (isPullToRefresh) {
            listMusic.add(RecyclerMusicData(RecyclerMusicData.TOP, null))
        }
        var musicDataList = music.data
        for (i in musicDataList.indices) {
            listMusic.add(RecyclerMusicData(RecyclerMusicData.MUSIC, musicDataList[i]))
            listMusic.add(RecyclerMusicData(RecyclerMusicData.BUTTOM, null))
        }
        return listMusic
    }

}