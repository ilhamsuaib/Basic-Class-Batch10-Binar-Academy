package sesi3

import java.util.*

fun main(args: Array<String>) {
    //blokArray()
    //blokList()
    //blokMap()
    blokLooping()
}

fun blokLooping() {
    //for
    var star = "*"
    for (i in 0..4) {
        println(star)
        star += "*"
    }

    //while
    var x = 0
    while (x < 5) {
        println("X : $x")
        x++
    }

    //do while
    var y = 0
    do {
        println("y : $y")
        y++
    } while (y < 5)
}

fun blokMap() {
    //immutable/static map
    val map = mapOf(Pair(0, "Ilham"), Pair(10, "Ahmad"), Pair(3, "Tri"))
    println(map)

    //mutable/dynamic map
    val mMap = mutableMapOf<String, String>()
    mMap["Nama1"] = "Joko"
    mMap["Nama2"] = "Rizal"
    mMap["Nama3"] = "Cahyo"
    mMap.remove("Nama3")
    println(mMap)
}

fun blokList() {
    //list immutable & mutable
    val staticList: List<String> = listOf("Ilham", "Faisal", "Ardi")
    println("Statis List : $staticList")
    val dynamicList = mutableListOf("Ilham A", "Faisal B", "Ardi C")
    dynamicList.add("Ahmad")
    dynamicList.add("Putri")
    dynamicList.add("Putra")
    dynamicList.add("Dewi")
    dynamicList.removeAt(0)
    dynamicList.remove("Dewi")
    dynamicList[1] = "Rio"
    dynamicList.addAll(staticList)
    dynamicList.sortByDescending { it }
    println("Dinamis List : $dynamicList")

    //iterasi/perulangan list
    dynamicList.forEachIndexed { index, data ->
        println("Data Ke-${index.plus(1)} : $data")
    }
}

fun blokArray() {
    //deklarasi array string dengan jumlah data (size) : 5
    val strings: Array<String> = Array(size = 5, init = { index -> "Index #$index" })
    println(Arrays.toString(strings))

    //iterasi/perulangan array
    strings.forEach { item ->
        println("Data : $item")
    }

    //manupulasi data array
    (0..strings.size.minus(1)).forEach {
        println("Nilai Awal : ${strings[it]}")
        strings[it] = "Data ${it}"
        println("Menjadi ${strings[it]}")
    }
}