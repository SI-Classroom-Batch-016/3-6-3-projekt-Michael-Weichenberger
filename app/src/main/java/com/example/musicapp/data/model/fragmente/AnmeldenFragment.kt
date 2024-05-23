package com.example.musicapp.data.model.fragmente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.musicapp.R
import com.example.musicapp.databinding.FragmentAnmeldenBinding


class AnmeldenFragment : Fragment() {

private lateinit var binding: FragmentAnmeldenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnmeldenBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.AnmeldenBTN.setOnClickListener {
            findNavController().navigate(R.id.listFragment)
        }
    }

}