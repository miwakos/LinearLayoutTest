package jp.techacademy.miwako.sugishita.linearlayouttest

import android.util.Log

open class Human(name: String, age: Int, var hobby: String) : Animal(name, age), Thinkable {

    override fun say() {
        Log.d(formatTestLogTag(), "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d(formatTestLogTag(), "私は" + this.hobby + "について考える。")
    }
}