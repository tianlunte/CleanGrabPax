package com.cleangrab.cleanpaxadr

import android.os.Bundle
import com.google.android.gms.gcm.GcmListenerService

/**
 * Created by qingyun.wang on 7/12/17.
 */

class GrabGcmListenerService: GcmListenerService() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onMessageReceived(from: String, data: Bundle) {
        super.onMessageReceived(from, data)
    }

    override fun onSendError(msgId: String, error: String) {
        super.onSendError(msgId, error)
    }

    override fun onDeletedMessages() {
        super.onDeletedMessages()
    }
}