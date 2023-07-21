package com.example.uashealthcare.model

import androidx.room.*

@Dao
interface FasilitasDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg fasilitas: Fasilitas)

    @Query("SELECT * FROM fasilitas")
    fun selectAllFasilitas(): List<Fasilitas>

    @Query("SELECT * FROM fasilitas WHERE uuid= :id")
    fun selectFasilitas(id:Int): Fasilitas

    @Delete
    fun deleteFasilitas(fasilitas: Fasilitas)

    @Query("UPDATE fasilitas SET nama=:nama WHERE uuid=:id")
    fun update(nama:String, id:Int)
}