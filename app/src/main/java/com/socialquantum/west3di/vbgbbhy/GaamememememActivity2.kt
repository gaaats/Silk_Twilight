package com.socialquantum.west3di.vbgbbhy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.socialquantum.west3di.databinding.ActivityGaamemememem2Binding
import com.socialquantum.west3di.qeffrfrrf.Gaaamememem2222222Activity2

class GaamememememActivity2 : AppCompatActivity() {


    private fun grjigtjigtjiogtjgtigtjiogt() {
        intent = Intent(this, Gaaamememem2222222Activity2::class.java).also {
            startActivity(it)
        }
    }



    private fun gtkgtojtgojjgtijgt() {
        defruihfhugttt()
        frhrfhuihrfihfrhurf()
    }

    private fun defruihfhugttt() {
        Toast.makeText(this, "Game started", Toast.LENGTH_SHORT).show()
    }

    private fun frhrfhuihrfihfrhurf() {
        gtjigtigithtg.bbbbbbttt.setOnClickListener {
            grjigtjigtjiogtjgtigtjiogt()
            figtiugthugtigtgtgt()
        }
    }

    private lateinit var gtjigtigithtg: ActivityGaamemememem2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gtjigtigithtg = ActivityGaamemememem2Binding.inflate(layoutInflater)
        setContentView(gtjigtigithtg.root)

        gtkgtojtgojjgtijgt()

    }



    private fun figtiugthugtigtgtgt() {
        finish()
    }
}