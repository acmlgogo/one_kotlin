package com.storm.cftest.retrofit

import com.storm.cftest.base.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

/**
 * 作者：Administrator on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
interface OneApi {

    @GET("/api/onelist/idlist/?channel=mi&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getOneIdlist(): Observable<OneID>

    @GET("/api/onelist/{id}/0?channel=mi&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getOneList(@Path("id") path: Int): Observable<One>

    @GET("/api/channel/music/more/0?channel=mi&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getMusiclist(): Observable<Music>

    @GET("/api/channel/reading/more/0?channel=mi&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getReadList(): Observable<Read>

    @GET("/api/channel/movie/more/0?channel=mi&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getMovieList(): Observable<Movie>

    @GET("/api/essay/{item_id}?channel=wdj&source=channel_reading&source_id=9264&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getReadDetails(@Path("item_id") path: Int): Observable<ReadDetails>

    @GET("/api/comment/praiseandtime/essay/{item_id}/0?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getComment(@Path("item_id") path: Int):Observable<Comment>

    @GET("/api/question/{item_id}?channel=wdj&source=channel_reading&source_id=9254&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getQuestion(@Path("item_id")path: Int):Observable<Question>

    @GET("/api/comment/praiseandtime/question/{item_id}/0?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    fun getQuestionComment(@Path("item_id") path: Int):Observable<Comment>
}