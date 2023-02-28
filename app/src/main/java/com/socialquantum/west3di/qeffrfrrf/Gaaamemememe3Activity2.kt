package com.socialquantum.west3di.qeffrfrrf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.socialquantum.west3di.databinding.ActivityGaaamemememe32Binding

class Gaaamemememe3Activity2 : AppCompatActivity() {

    private lateinit var biGaaamemememe32Binding: ActivityGaaamemememe32Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biGaaamemememe32Binding = ActivityGaaamemememe32Binding.inflate(layoutInflater)
        setContentView(biGaaamemememe32Binding.root)

        biGaaamemememe32Binding.clooose.setOnClickListener {
            finish()
        }
    }
}