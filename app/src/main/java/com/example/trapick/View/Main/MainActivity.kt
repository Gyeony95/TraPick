package com.example.trapick

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.amazonaws.auth.CognitoCachingCredentialsProvider
import com.amazonaws.mobileconnectors.lambdainvoker.LambdaFunctionException
import com.amazonaws.mobileconnectors.lambdainvoker.LambdaInvokerFactory
import com.amazonaws.regions.Regions
import com.example.trapick.Util.setupTimber
import com.example.trapick.View.Bookmark.BookmarkFragment
import com.example.trapick.View.Commu.CommuFragment
import com.example.trapick.View.Home.HomeFragment
import com.example.trapick.View.Map.MapFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setupTimber()

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
                showFragment(BookmarkFragment(this,this))
            }
        }
        return true
    }

    //프레그먼트 전환
    fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }

    fun setActionBarTitle(title: String?) {
        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.setTitle(title)
        }
    }
}
