package com.storm.cftest.darger.component

import com.storm.cftest.darger.OneModule
import com.storm.cftest.darger.ReadModule
import com.storm.cftest.ui.activity.ReadActivity
import com.storm.cftest.ui.fragment.ReadFregment
import dagger.Component
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/6/13
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Component(modules = arrayOf(ReadModule::class))
interface ReadComponent {
    fun Inject(readFregment: ReadFregment)
    fun Inject(readActivity: ReadActivity)
}