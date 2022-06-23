package com.example.nextnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class oneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        val btnPairs: Button = view.findViewById(R.id.btnPar)
        btnPairs.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_twoFragment)
        }
        val btnOdd: Button = view.findViewById(R.id.btnImp)
        btnOdd.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_threeFragment)
        }
        return view
    }
}