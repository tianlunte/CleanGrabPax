package com.cleangrab.cleanpaxadr

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

/**
 * Created by qingyun.wang on 11/12/17.
 */

fun <T> Single<T>.nullAfterDelay(delay: Long, def: T): Single<Optional<T>> {
    return map { Optional.of(it) }
            .timeout(delay, TimeUnit.MILLISECONDS, Schedulers.computation())
            .onErrorResumeNext { Single.just(Optional.of(def)) }
}

fun <T> nullAfterDelay(original: Single<T>, delay: Int): Single<Optional<T>> {
    val delayForNull = Single.just(Optional.absent<T>()).delay(delay.toLong(), TimeUnit.MILLISECONDS)
    return original.map<Optional<T>> { t -> Optional.of(t) }
            .mergeWith(delayForNull)
            .firstOrError()
}