package com.example.uashealthcare.util

import android.content.Context
import androidx.room.Room
import com.example.uashealthcare.model.ArtikelDatabase
import com.example.uashealthcare.model.FasilitasDatabase

val DB_NAME = "artikeldb"

fun buildDb(context: Context): ArtikelDatabase {
    val db = Room.databaseBuilder(context, ArtikelDatabase::class.java, DB_NAME)
        .build()
    return db
}

fun buildFasilitasDb(context: Context): FasilitasDatabase {
    val db = Room.databaseBuilder(context, FasilitasDatabase::class.java, "fasilitasdb")
        .build()
    return db
}