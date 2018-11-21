package sesi2

import java.util.*

/**deklarasi dan inisialisasi variabel*/
val nama: String = "Ilham"
val usia: Int = 22
val beratBadan: Double = 48.5
val tinggiBadan: Int = 160
val isStudent: Boolean = false
val pekerjaan: Array<String> = arrayOf("Programmer", "Tukang", "Gamer", "dll")
val nilaiPerSemester: Array<Int> = arrayOf(4, 2, 3, 3, 4, 4, 4)
val hobi: MutableList<String> = mutableListOf("Futsal", "Nonton", "Tidur", "Dll")
var jenisKelamin: String = "L"

//deklarasi variabel
lateinit var namaDepan: String

fun main(args: Array<String>) {
    println("Hello, World!")

    //inisialisasi
    namaDepan = "Muhammad"

    println("Nama Lengkap           : $namaDepan $nama")
    println("Usia                   : $usia")
    println("Berat Badan            : $beratBadan")
    println("Tinggi Badan           : $tinggiBadan")
    println("Seorang pelajar?       : $isStudent")
    println("Pekerjaan              : ${Arrays.toString(pekerjaan)}")
    println("Nilai semester akhir   : ${nilaiPerSemester.last()}")
    println("Hobi                   : ${hobi[1]}")
    println("Jenis Kelamin          : $jenisKelamin")
    println("Berat badan ideal      : ${tinggiBadan-100}")
}