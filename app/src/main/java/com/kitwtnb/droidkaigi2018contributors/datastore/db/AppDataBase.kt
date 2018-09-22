package com.kitwtnb.droidkaigi2018contributors.datastore.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.kitwtnb.droidkaigi2018contributors.datastore.data.ContributorEntity

@Database(
        entities = [
            ContributorEntity::class
        ],
        version = 1
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun contributorDao(): ContributorDao
}