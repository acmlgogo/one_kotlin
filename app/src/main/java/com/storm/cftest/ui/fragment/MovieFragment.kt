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
import android.widget.LinearLayout
import com.chad.library.adapter.base.BaseQuickAdapter
import com.storm.cftest.R
import com.storm.cftest.adapter.MovieRecyclerAdapter
import com.storm.cftest.base.Movie
import com.storm.cftest.base.RecyclerMovieData
import com.storm.cftest.darger.MovieModule
import com.storm.cftest.darger.OneModule
import com.storm.cftest.darger.component.DaggerMovieComponent
import com.storm.cftest.darger.component.DaggerOneComponent
import com.storm.cftest.ui.activity.BaseActivity
import com.xyz.leeeyou.zhihuribao.view.fragment.BaseFragment
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class MovieFragment : BaseFragment() {
    var mRecycler: RecyclerView? = null
    var mActivity: AppCompatActivity? = null
    var mAdapter: MovieRecyclerAdapter? = null
    @Inject
    lateinit var mObMovie: Observable<Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_movie_layout, null)
        mRecycler = view.findViewById(R.id.movie_recycler) as RecyclerView
        mRecycler!!.layoutManager = LinearLayoutManager(mActivity, LinearLayout.VERTICAL, false)
        mImg_load = view.findViewById(R.id.img_load) as ImageView
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initadapter()
        updateData()
    }

    private fun initadapter() {
        mAdapter = MovieRecyclerAdapter(null)
        mAdapter!!.removeAllFooterView()
        mAdapter!!.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        mRecycler!!.adapter = mAdapter
    }


    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        mActivity = activity as AppCompatActivity
    }

    override fun checkCanDoRefresh(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateData() {
        showLoading()
        loadMovieData()
    }

    private fun loadMovieData() {
        DaggerMovieComponent.builder().movieModule(MovieModule()).build().Inject(this)
        fecthMovieData()
    }

    private fun fecthMovieData() {
        mObMovie!!.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onError = {
                            hiddenLoading()
                        },
                        onComplete = {
                            hiddenLoading()
                        },
                        onNext = {
                            var movielist = parseMovieData(it)
                            mAdapter!!.setNewData(movielist)
                        }
                )
    }

    fun parseMovieData(data: Movie): MutableList<RecyclerMovieData> {
        var datalist: MutableList<RecyclerMovieData> = ArrayList<RecyclerMovieData>()
        var moviedata = data.data
        for (i in moviedata.indices) {
            datalist.add(RecyclerMovieData(RecyclerMovieData.MOVIE, moviedata[i]))
            datalist.add(RecyclerMovieData(RecyclerMovieData.BUTTOM, null))
        }
        return datalist
    }
}