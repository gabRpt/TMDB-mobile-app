package com.imt.tmdbpremium.entities

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
class Cast(val name: String, val character: String) : Parcelable {
    override fun toString(): String {
        return "$name as $character"
    }
}