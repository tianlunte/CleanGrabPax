package com.cleangrab.cleanpaxadr

import android.app.IntentService
import android.content.Context
import android.content.Intent

/**
 * Created by qingyun.wang on 7/12/17.
 */
private val TAG = GCMRegistrationService::class.java.simpleName

fun startGCMRegistration(context: Context?) {
    context?.startService(Intent(context, GCMRegistrationService::class.java))
}

class GCMRegistrationService: IntentService(TAG) {
    override fun onHandleIntent(intent: Intent?) {
        if (intent == null) {
            return
        }
    }
}