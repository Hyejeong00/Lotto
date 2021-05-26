package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result")// ?: return

        //result.sort()
        //println("result sorted is $result")

        val result_sorted = result?.sorted()

        val lottoImageStartId = R.drawable.ball_01 //146
//        val lottoImageId2 = R.drawable.ball_02 //149
//        val lottoImageId3 = R.drawable.ball_03 //148
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoImageStartId + result_sorted!![0] - 1)
        imageView2.setImageResource(lottoImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoImageStartId + result_sorted[5] - 1)

    }
}