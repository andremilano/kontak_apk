package com.andre0016.mobpro1.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.andre0016.mobpro1.model.Kontak
import kotlinx.coroutines.flow.Flow

@Dao
interface KontakDao {

    @Insert
    suspend fun insert(kontak: Kontak)

    @Update
    suspend fun update(kontak: Kontak)

    @Query("SELECT * FROM kontak ORDER BY nama ASC")
    fun getMahasiswa(): Flow<List<Kontak>>

    @Query("SELECT * FROM kontak WHERE id = :id")
    suspend fun getMahasiswaById(id: Long): Kontak?

    @Query("DELETE FROM kontak WHERE id = :id")
    suspend fun deleteById(id: Long)
}