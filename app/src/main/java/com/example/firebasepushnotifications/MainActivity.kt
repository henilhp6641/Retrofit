package com.example.firebasepushnotifications

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firebasepushnotifications.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Log","Hello, how are you?")

        var todoList= mutableListOf(
            Todo("Hello0000 world!",false),
            Todo("Hello H!",false),
            Todo("Hello E!",false),
            Todo("Hello N!",false),
            Todo("Hello I!",false),
            Todo("Hello L!",false)
        )

        val adapter = TodoAdapter(todoList)
        binding.rvTodo.adapter=adapter
        binding.rvTodo.layoutManager= LinearLayoutManager(this)

//        binding.btnAddTodo.setOnClickListener {
//            val title = binding.etTodo.text.toString()
//            val todo=Todo(title,false)
//            todoList.add(todo)
//            adapter.notifyItemInserted(todoList.size-1)
//        }


    }
}
