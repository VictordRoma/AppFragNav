package com.example.appfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        view.findViewById<Button>(R.id.Button2).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }
        // Inflate the layout for this fragment
        view.findViewById<Button>(R.id.Button3).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }
}