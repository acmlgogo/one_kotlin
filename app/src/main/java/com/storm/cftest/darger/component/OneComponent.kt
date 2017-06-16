package com.storm.cftest.darger.component

import com.storm.cftest.darger.OneModule
import com.storm.cftest.ui.activity.QuestionActivity
import com.storm.cftest.ui.activity.ReadActivity
import com.storm.cftest.ui.fragment.HomeFragment
import com.storm.cftest.ui.fragment.MovieFragment
import com.storm.cftest.ui.fragment.MusicFragment
import com.storm.cftest.ui.fragment.ReadFregment
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Component(modules = arrayOf(OneModule::class))
interface OneComponent {
    fun Inject(homeFragment: HomeFragment)





}