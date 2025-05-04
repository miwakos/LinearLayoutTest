package jp.techacademy.miwako.sugishita.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// パッケージレベルに定義した関数
fun formatMyTag(): String {
    return "[" + MY_TAG + "]"
}

// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.d("kotlintest", "ログへの出力テスト")

//        var num = 10
//        Log.d("kotlintest", Integer.toString(num))
//
//        num = 50
//        Log.d("kotlintest", num.toString())
//
//        // 演算子
//        val num1 = 10 + 5 - 2 * 4 / 2
//        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)
//
//        val flag1 = true
//        val flag2 = false
//        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
//        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))
//
//        val num2 = 10
//        val num3 = 20

//        num = 60
//
//        if (num >= 90) {
//            Log.d("kotlintest", "優")
//        } else if (num >= 75) {
//            Log.d("kotlintest", "良")
//        } else if (num >= 60) {
//            Log.d("kotlintest", "可")
//        } else {
//            Log.d("kotlintest", "不可")
//        }
//
//        val drink = 1
//
//        when (drink) {
//            0 -> {
//                Log.d("kotlintest", "コーヒーを注文しました")
//            }
//
//            1 -> Log.d("kotlintest", "紅茶を注文しました")
//            2 -> Log.d("kotlintest", "ミルクを注文しました")
//            else -> Log.d("kotlintest", "オーダーミスです")
//        }

//        // 繰り返し処理
//        for (i in 1 until 6) {
//            Log.d("kotlintest", "for文の " + i + "回目")
//        }
//
//        var num = 1 //事前にvar num の定義が残っている場合は、エラーがでるので、var を削除しましょう。
//
//        while (num < 6) {
//            Log.d("kotlintest", "while文の " + num + "回目")
//            num++
//        }
//
//        // 1から3まで（3を含む）
//        for (i in 1..3) {
//            Log.d("kotlintest", "..演算子の" + i + "の回")
//        }
//
//        // 6から2飛ばしずつ0まで
//        for (i in 6 downTo 0 step 2) {
//            Log.d("kotlintest", "downTo関数の" + i + "の回")
//        }
//
//
//        // 配列
//        // Array<Int>型の配列が作成される
//        val points = arrayOf(10, 6, 15, 23, 17)
//
//        for (i in points) {
//            Log.d("kotlintest", i.toString())
//        }
//
//
//        // 例外処理
//        val numA = 100
//        val numB = 0
//        var ans = 0
//
//        try{
//            ans = numA / numB
//        } catch (e : Exception) {
//            Log.d("kotlintest", "0で割ろうとしました")
//            // 例外情報から、メッセージを表示
//            Log.d("kotlintest", e.message.toString())
//        } finally {
//            Log.d("kotlintest", "ans = " + ans.toString())
//        }


//        // 引数に50と1000を指定してtotal関数を呼び出す
//        total(50, 1000)
//
//        // 引数の値を変えることで処理内容を簡単に変更できる
//        total(1, 1111)

//        val t = total(50, 1000)   // ここでtotalからsumを返してもらう
//        Log.d("kotlintest", t.toString())
//
//        // ラムダ式
//        val lmb = {x: Int, y: Int -> x + y}
//        val z = lmb(100, 200)
//
//        val s = {x: Int, y: Int -> x + y}(100, 200)
//
//
//        // 無名関数
//        val anf = fun(x: Int, y: Int): Int { return x + y}
//        val zz = anf(100, 200)
//
//        val ss = fun(x: Int, y: Int): Int { return x + y}(100, 200)


//        // クラス
//        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say()  // ポチが吠えます（ログ出力）
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//
//        val dog2 = Dog("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
//        dog2.say()  // ハチが吠えます（ログ出力）
//        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")
//
//        // コンパニオンオブジェクトの利用例
//        Dog.introduce()
//        Log.d("kotlintest", Dog.to_jp + "のクラス変数です。")



        // クラス
        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()
        dog.move()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

    }


    private fun total(first: Int, last: Int = 100): Int {
        var sum = 0
        for (i in first..last)  {
            sum += i
        }

        Log.d("kotlintest", sum.toString())

        return sum
    }
}