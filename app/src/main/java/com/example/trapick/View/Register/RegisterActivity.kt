package com.example.trapick.View.Register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trapick.R
import com.example.trapick.Util.Cognito
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

// ############################################################# End View Components
var authentication: Cognito? = null
private var userId: String? = null

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        authentication = Cognito(applicationContext)
        initViewComponents()
    }

    fun initViewComponents(){
        btn_register.setOnClickListener(){
            if(et_register_password.text.toString().endsWith(et_register_repeat_password.text.toString())){
                userId = et_register_email.text.toString().replace(" ","")
                authentication!!.addAttribute("nickname",et_register_nickname.text.toString())
                authentication!!.signUpInBackground(et_register_email.text.toString(),et_register_password.text.toString())
            }
        }
    }
}