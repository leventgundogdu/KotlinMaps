package com.leventgundogdu.kotlinmaps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leventgundogdu.kotlinmaps.model.Place


@Database(entities = arrayOf(Place::class), version = 1)
abstract class PlaceDatabase : RoomDatabase() {

    abstract fun placeDao() : PlaceDao

}