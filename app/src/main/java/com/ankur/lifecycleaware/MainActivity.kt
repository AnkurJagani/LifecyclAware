package com.ankur.lifecycleaware

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.e("AJ", "MainActivity::onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("AJ", "MainActivity::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("AJ", "MainActivity::onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("AJ", "MainActivity::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("AJ", "MainActivity::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("AJ", "MainActivity::onDestroy")
    }

}