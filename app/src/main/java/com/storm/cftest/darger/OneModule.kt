package com.storm.cftest.darger

import com.storm.cftest.base.*
import com.storm.cftest.retrofit.OneApi
import com.storm.cftest.retrofit.Service.HttpService

import dagger.Module
import dagger.Provides
import io.reactivex.Observable
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Module
class OneModule {
    val urlendport = "http://v3.wufazhuce.com:8000"
    var id = 0;

    constructor(ID: Int) {
        id = ID;
    }

    constructor()

    @Singleton
    @Provides
    fun ProvidesRetrofiID(): Observable<OneID> {
        return HttpService.Companion
                .createRetrofitOne(OneApi::class.java, urlendport)
                .getOneIdlist()
    }

    @Singleton
    @Provides
    fun ProvidesRetrofitList(): Observable<One> {
        return HttpService.Companion
                .createRetrofitOne(OneApi::class.java, urlendport)
                .getOneList(id)
    }







}