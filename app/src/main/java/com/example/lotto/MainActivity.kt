package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber (): Int{
    return Random().nextInt(45)+1
}

fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

        while(true) {
            var number: Int = getRandomLottoNumber()
//          var flag_existing: Int = 0
            if(lottoNumbers.contains(number)) {
//              flag_existing = 1
//              continue
            }
//          if (flag_existing.equals(1))
//              continue
//          else
            lottoNumbers.add(number)
            if(lottoNumbers.size >= 6)
                break
            }
            return lottoNumbers
        }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnConstellation = findViewById<CardView>(R.id.btnConstellation)
        val btnName = findViewById<CardView>(R.id.btnName)
        val btnRandom = findViewById<CardView>(R.id.btnRandom)

        btnConstellation.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }

        btnName.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }

        btnRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }
    }
}