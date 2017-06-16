package com.storm.cftest.darger

import com.storm.cftest.base.Movie
import com.storm.cftest.retrofit.OneApi
import com.storm.cftest.retrofit.Service.HttpService
import dagger.Module
import dagger.Provides
import io.reactivex.Observable
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/6/13
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Module
class MovieModule {
    val urlendport = "http://v3.wufazhuce.com:8000"
    var id = 0;

    constructor(ID: Int) {
        id = ID;
    }

    constructor()

    @Singleton
    @Provides
    fun ProvidesRetrofitMovieList(): Observable<Movie> {
        return HttpService.createRetrofitOne(OneApi::class.java,urlendport)
                .getMovieList()
    }
}