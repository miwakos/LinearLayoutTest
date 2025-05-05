package jp.techacademy.miwako.sugishita.linearlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// パッケージレベルに定義した定数
const val TEST_LOG_TAG = "kotlintest"

// パッケージレベルに定義した関数
fun formatTestLogTag(): String {
    return "[" + TEST_LOG_TAG + "]"
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val humanA = Human("山田太郎", 30, "サッカー")
        humanA.say()
        humanA.think()

        val humanB = Human("佐藤花子", 28, "バレーボール")
        humanB.say()
        humanB.think()
    }
}