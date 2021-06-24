package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var tvnums:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }
    fun castViews() {
        var rv_Numbers = findViewById<RecyclerView>(R.id.rv_numbers)
        rv_Numbers.layoutManager = LinearLayoutManager(baseContext)
        var numbersAdapter=NumbersRvAdapter(fibonnacci(100))
        rv_Numbers.adapter=numbersAdapter

    }
    fun fibonnacci(maxiNum:Int):List<BigInteger>{
        var count =0
        var first_number=0.toBigInteger()
        var second_number=1.toBigInteger()
        var fibbo= mutableListOf<BigInteger>()
        fibbo.add(first_number)
        fibbo.add(0.toBigInteger())

        while(count<maxiNum){
            println(first_number)
            var total=first_number+second_number
            first_number=second_number
            second_number=total
            count ++
            fibbo.add(first_number)
        }
        return fibbo

    }

}