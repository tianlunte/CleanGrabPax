package com.cleangrab.cleanpaxadr

import android.util.Log
import com.google.android.gms.iid.InstanceIDListenerService

/**
 * Created by qingyun.wang on 7/12/17.
 */

class GrabInstanceIDListenerService: InstanceIDListenerService() {

    override fun onTokenRefresh() {
        super.onTokenRefresh()

        startGCMRegistration(this)

        Log.d("WQY", "on token refresh")
    }

}