package com.example.wordapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wordapp.data.Variable
import com.example.wordapp.fragment.AlphabetListFragment
import com.example.wordapp.model.Alphabet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alphabetFragment = AlphabetListFragment().apply {
            arguments = Bundle().apply {
                putParcelableArrayList("alphabetList", ArrayList(Variable.alphabetList))
            }
        }
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, alphabetFragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}