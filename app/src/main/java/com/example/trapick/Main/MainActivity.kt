package com.example.trapick

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trapick.Main.MainAdapter
import com.example.trapick.Main.MainModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var arrayList = arrayListOf<MainModel>(
        MainModel("일본"),
        MainModel("중국"),
        MainModel("영국"),
        MainModel("스페인"),
        MainModel("프랑스"),
        MainModel("이탈리아"),
        MainModel("몽골"),
        MainModel("러시아"),
        MainModel("스위스")

        )
    val mAdapter = MainAdapter(this, arrayList)

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //각 바텀네비게이션 클릭했을때 이벤트
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    //textView.text = "Recent"

                    //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

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
                    val intent = Intent(this, CommuActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
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
        bottomNavigationView.selectedItemId = R.id.nav_home




        //액션바 설정
        var ab: ActionBar = this!!.supportActionBar!!
        ab.setTitle("ㅇㅇ님, 어서오세요!")
        //뒤로가기 버튼 만들어주는부분 -> 메니페스트에 부모액티비티 지정해줘서 누르면 그쪽으로 가게끔함
        //ab.setDisplayHomeAsUpEnabled(true)

        //리사이클러뷰 관련, 어댑터, 레이아웃매니저
        mainRecyclerview.adapter = mAdapter
        val lm = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        mainRecyclerview.layoutManager = lm
        mainRecyclerview.setHasFixedSize(true)//아이템이 추가삭제될때 크기측면에서 오류 안나게 해줌



    }
}
