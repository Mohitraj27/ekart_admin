package com.example.ekartadmin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ekartadmin.R
import com.example.ekartadmin.activity.AllOrderAcitivity
import com.example.ekartadmin.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

  private lateinit var binding: FragmentHomeBinding
          override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
              binding= FragmentHomeBinding.inflate(layoutInflater)

              binding.button.setOnClickListener {
                  findNavController().navigate(R.id.action_homeFragment2_to_categoryFragment2)
              }
              binding.button2.setOnClickListener {
                  findNavController().navigate(R.id.action_homeFragment2_to_productFragment2)
              }

              binding.button3.setOnClickListener {
                  findNavController().navigate(R.id.action_homeFragment2_to_sliderFragment2)
              }
              binding.button4.setOnClickListener {
                 startActivity(Intent(requireContext(),AllOrderAcitivity::class.java))
              }











              return binding.root
    }


}