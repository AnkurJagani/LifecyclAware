package com.ankur.lifecycleaware

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


/**
 * Created by Ankur Jagani on 25/07/22.
 * Copyright (c) 2022 Ankur Jagani. All rights reserved.
 * ankur.r.jagani@gmail.com
 */
class Observer : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.e("AJ", "Observer::onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.e("AJ", "Observer::onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.e("AJ", "Observer::onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.e("AJ", "Observer::onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.e("AJ", "Observer::onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.e("AJ", "Observer::onDestroy")
    }

}