package com.example.menulab2

interface Lista {

    val aList: ArrayList<Int> // Historial de vueltas

    fun clear() // Limpiar historial
    fun add(element: Int) // Agregar elemento
    fun del(elementIndex: Int) // Elimina elemento en la posición

}