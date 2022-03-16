package com.example.midterm.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PhonebookAdapter (private val listPhonebook: List<Phonebook>) : RecyclerView.Adapter<PhonebookViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PhonebookViewHolder.from(parent)

    override fun onBindViewHolder(holder: PhonebookViewHolder, position: Int) {
        holder.bin(listPhonebook[position])
    }

    override fun getItemCount() =listPhonebook.size

}