package com.example.wordapp.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.wordapp.R
import java.net.URLEncoder

class DetailAdapter(context:Context, listDetail:List<String>) : ArrayAdapter<String>(context,0,listDetail) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = LayoutInflater.from(context).inflate(R.layout.card,parent,false)
        val currItem = getItem(position)

        val textDisplay = itemView.findViewById<TextView>(R.id.card_title)
        textDisplay.text = currItem

        val cardContainer = itemView.findViewById<ConstraintLayout>(R.id.card_container)
        cardContainer.setOnClickListener {
            val googleSearchUrl = "https://www.google.com/search?q=${URLEncoder.encode(currItem, "UTF-8")}"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(googleSearchUrl))
            context.startActivity(intent)
        }

        return itemView
    }
}