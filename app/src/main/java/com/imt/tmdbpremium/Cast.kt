package com.imt.tmdbpremium

class Cast(val name: String, val character: String) {
    override fun toString(): String {
        return "$name as $character"
    }
}