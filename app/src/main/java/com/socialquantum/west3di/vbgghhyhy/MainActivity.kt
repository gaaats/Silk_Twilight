package com.socialquantum.west3di.vbgghhyhy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.socialquantum.west3di.R
import com.socialquantum.west3di.gtjgtjgtijitg.NJnfdrfrfrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val gt5gt5gt5gt by viewModel <NJnfdrfrfrf>(named("MainModel"))

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gt5gt5gt5gt.gttghyhyhy(this@MainActivity)
    }
}