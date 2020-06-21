package com.example.trapick.View.Login

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool
import com.example.trapick.R

class LoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val userPool = CognitoUserPool(this, userPoolId, userClientId, userPoolSecret, Regions)

    }
}