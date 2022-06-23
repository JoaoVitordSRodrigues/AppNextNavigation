package com.example.nextnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class fiveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_five, container, false)

        val btnNextOdd02: Button = view.findViewById(R.id.btnImp3)
        btnNextOdd02.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fiveFragment_to_sixFragment)
        }
        return view

    }

}