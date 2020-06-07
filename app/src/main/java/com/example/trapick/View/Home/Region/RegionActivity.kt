package com.example.trapick.View.Home.Region

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.R
import kotlinx.android.synthetic.main.activity_region.*

class RegionActivity : AppCompatActivity() {
    var arrayList = arrayListOf<RegionModel>(
        RegionModel("방콕/파타야","32"),
        RegionModel("치앙마이/치앙라이","14"),
        RegionModel("싱가포르/브루나이","12"),
        RegionModel("다낭/호이엔/후에","81"),
        RegionModel("하노이/하롱베이","52"),
        RegionModel("보라카이","12"),
        RegionModel("하노이/하롱베이","42"),
        RegionModel("싱가포르/브루나이","62"),
        RegionModel("방콕/파타야","2")

    )

    val mAdapter = RegionAdapter(this, arrayList)
    val mContext: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_region)

        region_recyclerview.apply {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)
            this.setHasFixedSize(true)
        }

        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.setTitle("동남아")
        }
    }
}
