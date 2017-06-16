package com.storm.cftest.darger.component

import com.storm.cftest.darger.QuestionModule
import com.storm.cftest.ui.activity.QuestionActivity
import dagger.Component
import javax.inject.Singleton

/**
 * 作者：程峰 on 2017/6/13
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
@Singleton
@Component(modules = arrayOf(QuestionModule::class))
interface QuestionComponent {
    fun Inject(questionActivity: QuestionActivity)
}