package com.example.newsfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = supportFragmentManager
            .beginTransaction()
            .add(R.id.news, newsFragment()).commit()

        val fragment2 = supportFragmentManager
            .beginTransaction()
            .add(R.id.details, detailsFragment.newInstance(Data.new[0])).commit()
    }
}