package com.storm.cftest.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.storm.cftest.R
import kotlinx.android.synthetic.main.in_regard_to_layout.*

/**
 * 作者：程峰 on 2017/6/12
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class IntroduceActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.in_regard_to_layout)
        initToolbar(toolbar, "介绍")
    }
}