package com.socialquantum.west3di.hyfrgtgtgt

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.socialquantum.west3di.vbgbbhy.GaamememememActivity2
import com.socialquantum.west3di.R
import com.socialquantum.west3di.vbgghhyhy.VebbboboboboActivity2
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.bngjgthgthtghgt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.codeCodegtgt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.ghgtgt59
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.gt2hyhyhy
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.gtgthtghgthugt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.gtgtitgigt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.gtitghugt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.tjiotojigtjgt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.hy5hy95h
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.hy6hy59hy
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.instIdgttg
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.nhyjiohyiohy5
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.onegtgt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.trolologttggt
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.vbfbbrfgfrggrffr
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.tgkogtkgtkgtko
import com.socialquantum.west3di.gtgtjijijigt.NIFjjjirf.vfbhbfryurfgrfrf
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FivivivieieieviveivevekFragment : Fragment() {

    private fun gtgtoijjjig() {
        activity?.finish()
    }

    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    private lateinit var gt5gt59gt59gt: Context
    val gy5hy59h5hy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gt5gt59gt59gt = context
    }

    override fun onStart() {
        super.onStart()


        val g59gt59gt95g: String? = gy5hy59h5hy.getString(instIdgttg, null)
        val gtojigtjtgjgtjigtj = Build.VERSION.RELEASE
        val bgnbnbgnbguhbghg = gy5hy59h5hy.getString("deepSt", null)
        val hjoihhfrfrgfrrg = gy5hy59h5hy.getString(codeCodegtgt, null)
        val hihfhgtgthgt = gy5hy59h5hy.getString(nhyjiohyiohy5, null)


        val vbffrygfrrfgrfg = gy5hy59h5hy.getString(bngjgthgthtghgt, null)
        val gjgtojgt = gy5hy59h5hy.getString(gtgthtghgthugt, null)
        val gthgtigthgthgt = hy5hy95h

        val cdvdetfedfedffedfed = gy5hy59h5hy.getString(tjiotojigtjgt, null)
        val gthutguhugthgtgtgt = gy5hy59h5hy.getString("appCamp", null)
        val bngngughgthugt = gy5hy59h5hy.getString("mainId", null)

        val fhrirfurfuhrf = Intent(activity, VebbboboboboActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GaamememememActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(gt5gt59gt59gt)
        rfhihfrhrfhfrhrfhihrf()

        gy5hy59h5hy.edit().putString(ghgtgt59, afIdhyhyhy).apply()

        val gngnufhhth = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$gthutguhugthgtgtgt&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gt2hyhyhy$gthgtigthgthgt&$tgkogtkgtkgtko$gtojigtjtgjgtjigtj&$hy6hy59hy$gtgtitgigt"
        val cdvedtdeffdeed = "$vbffrygfrrfgrfg$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$g59gt59gt95g&$gt2hyhyhy$gthgtigthgthgt&$tgkogtkgtkgtko$gtojigtjtgjgtjigtj&$hy6hy59hy$gtgtitgigt"
        val vbyrfgrfrfg = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gt2hyhyhy$gthgtigthgthgt&$tgkogtkgtkgtko$gtojigtjtgjgtjigtj&$hy6hy59hy$trolologttggt"
        val bmgjhyjhyjojihy = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$g59gt59gt95g&$gt2hyhyhy$gthgtigthgthgt&$tgkogtkgtkgtko$gtojigtjtgjgtjigtj&$hy6hy59hy$trolologttggt"

        Toast.makeText(requireContext(), "$hihfhgtgthgt deep $bgnbnbgnbguhbghg", Toast.LENGTH_SHORT).show()

        when(hihfhgtgthgt) {
            "1" ->
                if(gthutguhugthgtgtgt!="null") {
                    gy5hy59h5hy.edit().putString(gtitghugt, gngnufhhth).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else if (bgnbnbgnbguhbghg!=null||hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    gy5hy59h5hy.edit().putString(gtitghugt, vbyrfgrfrfg).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    gtgtoijjjig()
                }
            "0" ->
                if(bgnbnbgnbguhbghg!=null) {
                    gy5hy59h5hy.edit().putString(gtitghugt, bmgjhyjhyjojihy).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else if (hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    gy5hy59h5hy.edit().putString(gtitghugt, cdvedtdeffdeed).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "geo").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    gtgtoijjjig()
                }
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fivivivieieieviveivevek, container, false)
    }

}