package com.example.homework_3_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_3_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {

            var digit = 1
            var count = Integer.parseInt(binding.textView.text.toString())
            var sum = digit + count
            binding.textView.text = sum.toString()
            if (binding.textView.text.equals("11")) {
                binding.btn.text = "-1"
                sum = digit - count
                binding.textView.text = sum.toString()
            }
            if (binding.textView.text.equals("0")) {
                    intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)
                    finish()
                }
        }
    }
}