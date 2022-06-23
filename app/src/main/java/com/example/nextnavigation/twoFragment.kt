package com.example.nextnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class twoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view =  inflater.inflate(R.layout.fragment_two, container, false)
        val btnNextPairs1: Button = view.findViewById(R.id.btnPar2)
        btnNextPairs1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twoFragment_to_fourFragment)
        }
        return view
    }
}