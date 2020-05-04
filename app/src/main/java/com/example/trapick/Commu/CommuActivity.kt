package com.example.trapick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class CommuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commu)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    //textView.text = "Recent"
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)

                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_map -> {
                    //textView.text = "Favorite"
                    val intent = Intent(this, MapActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_commu -> {
                    //textView.text = "Nearby"
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_bookmark -> {
                    //textView.text = "Nearby"
                    val intent = Intent(this, BookMarkActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
        //현재 선택된 뷰 다시 선택했을때
        bottomNavigationView.setOnNavigationItemReselectedListener {
            //Toast.makeText(this, "${it.title} is Reselected", Toast.LENGTH_SHORT).show()
        }
        // select item
        bottomNavigationView.selectedItemId = R.id.nav_commu
    }
}
