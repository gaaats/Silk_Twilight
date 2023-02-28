package com.socialquantum.west3di.hyfrgtgtgt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.socialquantum.west3di.R
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.nhyjiohyiohy5
import com.socialquantum.west3di.gtjgtjgtijitg.NJnfdrfrfrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FoorororororrFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val g5t955gt595gt = sharePgtgtgt.getString(nhyjiohyiohy5, null)
        val hyhyhyhyhy = sharePgtgtgt.getString("appCamp", null)

        if (g5t955gt595gt=="1" &&hyhyhyhyhy == null) {
            gtkogtkogtoktgogt.gtthyhyhy(mContextgtgtgt)
            gtkogtkogtoktgogt.gtgt5gt5gt.observe(viewLifecycleOwner) {
                if (it != null) {
                    gtgthigthgthugt = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", gtgthigthgthugt).apply()
                    gtjiogtjigtjijigt()
                }
            }
        } else {
            gtjiogtjigtjijigt()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_foorororororr, container, false)
    }

    val gtkogtkogtoktgogt by activityViewModel<NJnfdrfrfrf>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gtgthigthgthugt: String
    private lateinit var mContextgtgtgt: Context

    private fun gtjiogtjigtjijigt() {
        findNavController().navigate(R.id.action_foorororororrFragment_to_fivivivieieieviveivevekFragment)
    }

}