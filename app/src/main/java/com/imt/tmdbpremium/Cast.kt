package com.imt.tmdbpremium

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class Cast(val name: String, val character: String) : Parcelable {
    override fun toString(): String {
        return "$name as $character"
    }
}