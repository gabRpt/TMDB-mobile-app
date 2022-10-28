package com.imt.tmdbpremium.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class Cast(val name: String) : Parcelable {
    override fun toString(): String {
        return "$name"
    }
}