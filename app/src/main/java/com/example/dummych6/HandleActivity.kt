package com.example.dummych6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.example.dummych6.databinding.ActivityHandleBinding
import com.example.dummych6.databinding.ActivityMainBinding

class HandleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHandleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHandleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //handler

        val handler = object : Handler(Looper.getMainLooper()){
            override fun handleMessage(msg: Message) {
                val message = msg.obj as String
                binding.tvNama.text = message
            }
        }
        binding.btnKlik.setOnClickListener {
            Thread(Runnable{
                val text =  "Isna"
                val msg = Message.obtain()
                msg.obj = text
                msg.target = handler
                msg.sendToTarget()
            }).start()
        }

    }

}
