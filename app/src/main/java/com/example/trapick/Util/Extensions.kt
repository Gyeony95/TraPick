package com.example.trapick.Util

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.trapick.R
import timber.log.Timber

fun AppCompatActivity.setupTimber() {
    Timber.plant(Timber.DebugTree())
}

//토스트 만들기
//this.makeToast(R.string.touch_album_btn)
fun AppCompatActivity.makeToast(id: Int) {
    Toast.makeText(this, this.getString(id), Toast.LENGTH_LONG).show()
}

//this.makeToast("원하는 내용")
fun AppCompatActivity.makeToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Fragment.makeToast(id: Int) {
    Toast.makeText(context, this.getString(id), Toast.LENGTH_LONG).show()
}

//this.makeToast("원하는 내용")
fun Fragment.makeToast(text: String) {
    Toast.makeText(context, text, Toast.LENGTH_LONG).show()
}
