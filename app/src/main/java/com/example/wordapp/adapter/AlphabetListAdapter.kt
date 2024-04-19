package com.example.wordapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.wordapp.R
import com.example.wordapp.fragment.DetailFragment
import com.example.wordapp.model.Alphabet

class AlphabetListAdapter(context:Context, alphabetlist:List<Alphabet>) : ArrayAdapter<Alphabet>(context,0,alphabetlist) {
    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = LayoutInflater.from(context).inflate(R.layout.card,parent,false)
        val currItem = getItem(position)

        val textDisplay = itemView.findViewById<TextView>(R.id.card_title)
        textDisplay.text = currItem?.name

        val cardContainer = itemView.findViewById<ConstraintLayout>(R.id.card_container)
        cardContainer.setOnClickListener {
            val detailFragment = DetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable("alphabet", currItem)
                }
            }
            val fragmentManager = (context as AppCompatActivity).supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, detailFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return itemView
    }
}