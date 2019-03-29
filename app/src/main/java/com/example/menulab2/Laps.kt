package com.example.menulab2

class Laps(override val aList: ArrayList<Int>) :Lista {

    override fun clear() {
        aList.clear()
    }

    override fun del(elementIndex: Int) {
        aList.remove(elementIndex)
    }

    override fun add(element: Int) {
        aList.add(element)
    }
}