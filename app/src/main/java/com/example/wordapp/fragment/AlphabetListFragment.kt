package com.example.wordapp.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.wordapp.R
import com.example.wordapp.adapter.AlphabetListAdapter
import com.example.wordapp.model.Alphabet

class AlphabetListFragment : Fragment() {

    private var alphabetList : List<Alphabet>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            alphabetList = it.getParcelableArrayList("alphabetList")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_alphabet_list, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val alphabetListView = view.findViewById<ListView>(R.id.aplhabet_list_view)
        alphabetListView.adapter = AlphabetListAdapter(requireContext(), alphabetList!!)
    }

}