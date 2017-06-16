package com.storm.cftest.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * 作者：程峰 on 2017/5/27
 * 邮箱：cf550272553@live.com
 * github :https://github.com/acmlgogo
 */
class MainViewpagerAdapter(fm: FragmentManager?, val fragment: ArrayList<Fragment>) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return fragment.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment.get(position)
    }


}