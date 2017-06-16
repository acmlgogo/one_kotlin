package com.storm.cftest.darger.component

import com.storm.cftest.darger.MovieModule
import com.storm.cftest.ui.fragment.MovieFragment
import dagger.Component
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/6/13
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Component(modules = arrayOf(MovieModule::class))
interface MovieComponent {
    fun Inject(movieFragment: MovieFragment)
}