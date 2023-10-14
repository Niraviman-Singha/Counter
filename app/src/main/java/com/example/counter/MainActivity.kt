package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewmodel:MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewmodel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.counterTV.text = myViewmodel.getInitialCounter().toString()

        binding.incrementBtn.setOnClickListener {
            binding.counterTV.text = myViewmodel.getUpdatedCounter().toString()
        }
    }
}