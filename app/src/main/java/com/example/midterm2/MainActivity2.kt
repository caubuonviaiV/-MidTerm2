package com.example.midterm2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.midterm.recyclerview.Phonebook
import com.example.midterm2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener {
            val name = binding.edtName.text.toString()
            val phone = binding.edtPhone.text.toString()

            val phonebook = Phonebook(name, phone)

            MainActivity.Phonebooks.add(phonebook)

            finish()
        }
    }
}