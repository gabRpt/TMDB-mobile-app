package com.imt.tmdbpremium.datasources.locale

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.imt.tmdbpremium.datasources.locale.converters.LocalDateConverter
import com.imt.tmdbpremium.entities.Movie


@Database(entities = [Movie::class], version = 1)
@TypeConverters(LocalDateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}