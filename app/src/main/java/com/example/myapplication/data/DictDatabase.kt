package com.example.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 2)
abstract class WordDatabase : RoomDatabase() {
    abstract fun wordDAO(): WordDAO

}