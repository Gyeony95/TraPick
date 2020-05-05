package com.example.trapick

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.trapick.Bookmark.BookmarkFragment
import com.example.trapick.Commu.CommuFragment
import com.example.trapick.Home.HomeFragment
import com.example.trapick.Map.MapFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment(HomeFragment(this))
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.nav_home ->{
                showFragment(HomeFragment(this))
            }
            R.id.nav_map -> {
                showFragment(MapFragment())
            }
            R.id.nav_commu -> {
                showFragment(CommuFragment())
            }
            R.id.nav_bookmark -> {
                showFragment(BookmarkFragment())
            }
        }
        return true
    }

    //프레그먼트 전환
    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }
}
