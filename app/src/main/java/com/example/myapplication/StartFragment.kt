package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController



class StartFragment : Fragment() {

    private lateinit var loginbtn: Button
    private lateinit var registerbtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
       loginbtn = view.findViewById(R.id.LoginBtn)
        registerbtn = view.findViewById(R.id.RegisterBtn)

        loginbtn.setOnClickListener{
            findNavController().navigate(R.id.action_startFragment_to_loginFragment)
        }
        registerbtn.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_chooseFragment)
        }

        return  view
    }


}