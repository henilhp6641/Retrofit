package com.example.firebasepushnotifications

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.firebasepushnotifications.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: TestViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.Theme_FirebasePushNotifications)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[TestViewModel::class.java]

        viewModel.currentNumber.observe(this, Observer {
            binding.tvCurrentNumber.text = it.toString()
        })

        viewModel.currentBoolean.observe(this, Observer {
            binding.tvCurrentBoolean.text = it.toString()
        })

        incrementText()
    }

    private fun incrementText() {
        binding.btn.setOnClickListener {
            viewModel.currentNumber.value = viewModel.number++
            viewModel.currentBoolean.value = viewModel.number % 2 == 0
//            binding.tvCurrentNumber.text =  viewModel.currentNumber.value.toString() //Using this method, we can also save data into UI without using Observer
//            binding.tvCurrentBoolean.text =  viewModel.currentBoolean.value.toString()
        }
    }
}
