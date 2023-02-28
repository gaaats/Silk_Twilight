package com.socialquantum.west3di.bgbhyhyhyhy

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.bngjgtitghgtg
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.tjiotojigtjgt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.instIdgttg
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.vfbrfgfrgrfgrfgyrfgy
import com.socialquantum.west3di.gtjgtjgtijitg.bgbgnhhy5995uj5ju
import com.socialquantum.west3di.gtjgtjgtijitg.hhy5hy595hy95hy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Apliicatititonee : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val gtgt55h59hy9yh = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val bhyhjyujujuj = getSharedPreferences("PREFS_NAME", 0)

        val h5yhj9j5uj5uj = MyTracker.getTrackerParams()
        val gtngtgtjiogtji = MyTracker.getTrackerConfig()
        val njuju55kik59k5ik = MyTracker.getInstanceId(this)
        gtngtgtjiogtji.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (bhyhjyujujuj.getBoolean("my_first_time", true)) {
            h5yhj9j5uj5uj.setCustomUserId(IDINgtgtgt)
            gtgt55h59hy9yh.edit().putString(tjiotojigtjgt, IDINgtgtgt).apply()
            gtgt55h59hy9yh.edit().putString(instIdgttg, njuju55kik59k5ik).apply()
            bhyhjyujujuj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val nrfedfrerfrf = gtgt55h59hy9yh.getString(tjiotojigtjgt, IDINgtgtgt)
            h5yhj9j5uj5uj.setCustomUserId(nrfedfrerfrf)
        }
        MyTracker.initTracker(bngjgtitghgtg, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Apliicatititonee)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hhy5hy595hy95hy
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }

}