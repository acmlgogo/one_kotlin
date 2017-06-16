package com.storm.cftest.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.storm.cftest.R
import com.storm.cftest.activity
import com.storm.cftest.adapter.MainViewpagerAdapter
import com.storm.cftest.toast
import com.storm.cftest.ui.fragment.HomeFragment
import com.storm.cftest.ui.fragment.MovieFragment
import com.storm.cftest.ui.fragment.MusicFragment
import com.storm.cftest.ui.fragment.ReadFregment
import com.storm.cftest.uitls.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.read_activity_layout.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener, ViewPager.OnPageChangeListener, NavigationView.OnNavigationItemSelectedListener {


    var prevMenuItem: MenuItem? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview();
    }

    private fun initview() {



        setSupportActionBar(main_toolbar)
        // 关联 Drawerlayout 和 navigationview    syncState同步状态
        var toggle = ActionBarDrawerToggle(this, main_drawerlayout, main_toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toggle.syncState()
        main_viewpager.adapter = MainViewpagerAdapter(supportFragmentManager, arrayListOf(HomeFragment(), ReadFregment(), MusicFragment(), MovieFragment()))
        main_viewpager.setOnPageChangeListener(this)
        main_bottomnavigation.setOnNavigationItemSelectedListener(this)
        main_navigation.setNavigationItemSelectedListener(this)
        BottomNavigationViewHelper.disableShiftMode(main_bottomnavigation)

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.menu_home -> main_viewpager.currentItem = 0
            R.id.menu_read -> main_viewpager.currentItem = 1
            R.id.menu_music -> main_viewpager.currentItem = 2
            R.id.menu_movie -> main_viewpager.currentItem = 3
            R.id.gaunyu -> {
                activity(this, IntroduceActivity::class.java)
                main_drawerlayout.closeDrawer(GravityCompat.START)
            }
        }
        return true;
    }

    /**
     *  viewpager 选择改变监听
     * */
    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        main_bottomnavigation.menu.getItem(position).isChecked = true
        prevMenuItem = main_bottomnavigation.menu.getItem(position);

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {

        }
        return super.onOptionsItemSelected(item)
    }
}
