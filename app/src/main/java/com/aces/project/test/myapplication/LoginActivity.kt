package com.aces.project.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aces.project.test.myapplication.databinding.ActivityLoginBinding
import com.aces.project.test.myapplication.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}