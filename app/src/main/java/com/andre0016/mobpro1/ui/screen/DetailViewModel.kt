package com.andre0016.mobpro1.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andre0016.mobpro1.database.KontakDao
import com.andre0016.mobpro1.model.Kontak
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Locale

class DetailViewModel(private val dao: KontakDao) : ViewModel() {

    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    fun insert(nomor: String, nama: String, kelas: String) {
        val mahasiswa = Kontak(
            nama = nama,
            nomor = nomor,
            kategori = kelas
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(mahasiswa)

        }
    }
    suspend fun getMahasiswa(id: Long): Kontak? {
        return dao.getMahasiswaById(id)
    }

    fun update(id: Long, nomor: String, nama: String, kelas: String) {
        val mahasiswa = Kontak(
            id = id,
            nama = nama,
            nomor = nomor,
            kategori = kelas
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(mahasiswa)
        }
    }

    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}
