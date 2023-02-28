package com.socialquantum.west3di.qeffrfrrf

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.socialquantum.west3di.databinding.ActivityGaaamememem2222222Binding

class Gaaamememem2222222Activity2 : AppCompatActivity() {

    private val lissstElements by lazy {
        listOf(
            gaaamememem2222222Binding.imgGameElem1,
            gaaamememem2222222Binding.imgGameElem2,
            gaaamememem2222222Binding.imgGameElem3,
            gaaamememem2222222Binding.imgGameElem4,
            gaaamememem2222222Binding.imgGameElem5,
            gaaamememem2222222Binding.imgGameElem6,
            gaaamememem2222222Binding.imgGameElem7,
            gaaamememem2222222Binding.imgGameElem8,
        )
    }

    private fun makeCheckVisibility() {
        lissstElements.forEach {
            if (it.visibility == View.VISIBLE) return
        }
        frjrfojrfoirfjrfgt()
    }

    private fun frjrfojrfoirfjrfgt() {
        val intent = Intent(this, Gaaamemememe3Activity2::class.java).also {
            frjiifr(it)
            frrfirfhfrf()
        }
    }

    private fun frjiifr(it: Intent) {
        startActivity(it)
    }


    private lateinit var gaaamememem2222222Binding: ActivityGaaamememem2222222Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gaaamememem2222222Binding = ActivityGaaamememem2222222Binding.inflate(layoutInflater)
        setContentView(gaaamememem2222222Binding.root)

        frjfrrfiurffr()

        vngtjgtjjgtijgtgt()

        vbfbguihgtgtgt()

        vfbvfjbfvbvbfhfvvf()

        rfrhirfiufhfr()


    }

    private fun vngtjgtjjgtijgtgt() {
        gaaamememem2222222Binding.imgGameElem1.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }

        gaaamememem2222222Binding.imgGameElem2.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }
    }

    private fun vbfbguihgtgtgt() {
        gaaamememem2222222Binding.imgGameElem3.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }

        gaaamememem2222222Binding.imgGameElem4.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }
    }

    private fun vfbvfjbfvbvbfhfvvf() {
        gaaamememem2222222Binding.imgGameElem5.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }

        gaaamememem2222222Binding.imgGameElem6.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }
    }

    private fun rfrhirfiufhfr() {
        gaaamememem2222222Binding.imgGameElem7.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }

        gaaamememem2222222Binding.imgGameElem8.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            makeCheckVisibility()
        }
    }

    private fun frjfrrfiurffr() {
        gaaamememem2222222Binding.skiiip.setOnClickListener {
            val intent = Intent(this, Gaaamemememe3Activity2::class.java).also {
                startActivity(it)
                frrfirfhfrf()
            }
        }
    }

    private fun frrfirfhfrf() {
        finish()
    }
}