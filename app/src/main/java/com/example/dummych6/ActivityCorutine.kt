package com.example.dummych6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dummych6.databinding.ActivityCorutineBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

class ActivityCorutine : AppCompatActivity() {
    private lateinit var binding: ActivityCorutineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCorutineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCorutine.setOnClickListener {
            GlobalScope.async {
                submit()
            }
        }

    }

    suspend fun submit(){
        delay(1000)
        Log.d("Kenalan!", "Salam Kenal!")
    }
}