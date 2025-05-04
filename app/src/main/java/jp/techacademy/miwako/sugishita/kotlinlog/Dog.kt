package jp.techacademy.miwako.sugishita.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // コンパニオンオブジェクトを使用した方法
    companion object {
        val to_jp = "犬"

        fun introduce() {
            Log.d("kotlintest", "これは犬クラスです。")
        }
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}