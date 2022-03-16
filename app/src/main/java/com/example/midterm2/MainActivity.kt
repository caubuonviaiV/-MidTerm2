package com.example.midterm2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.midterm.recyclerview.Phonebook
import com.example.midterm.recyclerview.PhonebookAdapter
import com.example.midterm2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listMusics.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = PhonebookAdapter(Phonebooks)
        }
        //Chuyển màn hình
        binding.fabAdd.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // binding.listMusics.adapter = MusicAdapter(Musics)
        binding.listMusics.adapter?.notifyDataSetChanged()
    }

    companion object {
        val Phonebooks = mutableListOf<Phonebook>()
    }
}