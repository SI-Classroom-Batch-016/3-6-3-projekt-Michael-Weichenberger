package com.example.musicapp.data.model.fragmente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.musicapp.R
import com.example.musicapp.databinding.FragmentAnmeldenBinding

// Definiere ein Fragment für den Anmeldebildschirm
class AnmeldenFragment : Fragment() {

    private lateinit var binding: FragmentAnmeldenBinding

    // Erstelle die Ansicht des Fragments
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // binding wird erstellt
        binding = FragmentAnmeldenBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    // Führe Aktionen nach der Erstellung der Ansicht aus
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Setze den Klicklistener für die Anmelde-Schaltfläche
        binding.AnmeldenBTN.setOnClickListener {
            findNavController().navigate(R.id.listFragment)
        }
    }

}