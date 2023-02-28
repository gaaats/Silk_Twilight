package com.socialquantum.west3di.gtjgtjgtijitg

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.socialquantum.west3di.bghyhyyhhy.YGfyrgfrgrfrf
import com.socialquantum.west3di.bgnbgjnhyhy.OKOfkrkfrrfokfr
import com.socialquantum.west3di.fgtjioji.IJifjrfjijfrjirf
import com.socialquantum.west3di.fkgtkok.UHfhhhrfuhhfr
import com.socialquantum.west3di.fkgtkok.JIJfrijjifrrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun hyhy5hy59hy5(): Gson {
    return GsonBuilder().create()
}

val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        NJnfdrfrfrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        UHfhhhrfuhhfr(get())
    }
}

val hhy5hy595hy95hy = module {

    single  <OKOfkrkfrrfokfr> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(OKOfkrkfrrfokfr::class.java)
    }

    single <YGfyrgfrgrfrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(YGfyrgfrgrfrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://silktwilight.life/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        JIJfrijjifrrfrf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        IJifjrfjijfrjirf(get(named("HostInter")))
    }
    single{
        hyhy5hy59hy5()
    }
    single (named("SharedPreferences")) {
        h26hyhyhy6(androidApplication())
    }
}

fun h26hyhyhy6(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


