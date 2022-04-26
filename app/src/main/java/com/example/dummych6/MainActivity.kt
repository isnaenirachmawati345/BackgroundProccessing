package com.example.dummych6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.example.dummych6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnHandler.setOnClickListener {
                val intent = Intent(this@MainActivity, HandleActivity::class.java)
                startActivity(intent)
            }

            btnAsyncTask.setOnClickListener {
                val intent = Intent(this@MainActivity, AsynTaskActivity::class.java)
                startActivity(intent)
            }

            btnCoroutines.setOnClickListener {
                val intent = Intent(this@MainActivity, ActivityCorutine::class.java)
                startActivity(intent)
            }
        }

    }

}