package com.storm.cftest.darger.component

import com.storm.cftest.darger.MusicModule
import com.storm.cftest.ui.fragment.MusicFragment
import dagger.Component
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/6/13
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Component (modules= arrayOf(MusicModule::class))
interface MusicComponent {
    fun Inject(musicFragment: MusicFragment)
}