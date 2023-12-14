package com.aces.project.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aces.project.test.myapplication.databinding.ActivityMainBinding

class EmptyActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}