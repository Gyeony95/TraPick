package com.example.trapick.View.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.trapick.MainActivity
import com.example.trapick.R


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        try {
            Thread.sleep(3000); //3초 인트로화면 보여주기
            val intent = Intent(this, MainActivity::class.java)            // 실제 사용할 메인 액티비티
            startActivity(intent)
            finish()
        } catch (e: Exception)
        {
            return;
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}
