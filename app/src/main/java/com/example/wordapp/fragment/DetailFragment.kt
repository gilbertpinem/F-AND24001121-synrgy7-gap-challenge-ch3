package com.example.wordapp.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.wordapp.R
import com.example.wordapp.adapter.DetailAdapter
import com.example.wordapp.model.Alphabet

class DetailFragment : Fragment() {

    private var alphabet:Alphabet? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            alphabet = it.getParcelable("alphabet")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backButton = view.findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        val headerText = view.findViewById<TextView>(R.id.header_text)
        headerText.text = "Words That Start with ${alphabet!!.name}"

        val detailListView = view.findViewById<ListView>(R.id.detail_list_view)
        detailListView.adapter = DetailAdapter(requireContext(),alphabet!!.member)

    }
}