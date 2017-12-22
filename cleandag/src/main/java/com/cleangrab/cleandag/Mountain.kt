package com.cleangrab.cleandag

import android.util.Log
import javax.inject.Inject

/**
 * Created by qingyun.wang on 22/12/17.
 */

interface Mountain {
    fun climb()
}

class MountainImpl @Inject constructor(): Mountain {
    override fun climb() {
        Log.d("WQY", "climb climb climb, ahahahahaha")
    }
}