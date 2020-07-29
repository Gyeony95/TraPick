package com.example.trapick.View.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trapick.R
import com.example.trapick.Util.Cognito
import com.example.trapick.View.Register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Login"
        initViewComponents()


    }

    fun initViewComponents(){
        tv_register.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        //로그인처리
        btn_login.setOnClickListener(){
            val authentication = Cognito(applicationContext)
            authentication.userLogin(
                et_input_email.getText().toString().replace(" ", ""),
                et_input_password.getText().toString()
            )
        }

    }
}