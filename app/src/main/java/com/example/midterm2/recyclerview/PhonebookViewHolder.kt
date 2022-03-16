package com.example.midterm.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm2.databinding.ItemPhonebookBinding

class PhonebookViewHolder private constructor(private val binding: ItemPhonebookBinding): RecyclerView.ViewHolder(binding.root){

    companion object {
        fun from(parent: ViewGroup):PhonebookViewHolder {
            val binding = ItemPhonebookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return PhonebookViewHolder(binding)
        }
    }

    fun bin(phonebook: Phonebook) {
        binding.name.text = phonebook.name
        binding.phone.text = phonebook.phone
    }
}