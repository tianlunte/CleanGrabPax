package com.cleangrab.cleanpaxadr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.cleangrab.cleanpaxadr.di.DaggerAppComponent
import com.cleangrab.cleanpaxadr.models.IntContainer
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import org.reactivestreams.Publisher
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor
import javax.inject.Inject

// https://dzone.com/articles/rxjava-idiomatic-concurrency-flatmap-vs-parallel
// https://www.safaribooksonline.com/library/view/learning-rxjava/9781787120426/32d4c5e7-08dc-43d6-9f3d-fc494aebdc0c.xhtml
class MainActivity : AppCompatActivity() {

    @Inject lateinit var times: IntContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("WQY", "--> " + BuildConfig.CA_CERT_NEW.size)
        Log.d("WQY", "--> " + BuildConfig.CA_CERT_NEW[1])

        DaggerAppComponent.builder().build().getHomeBuilder().build().inject(this)

        Log.d("WQY", "--> ${times.num}")
    }
}