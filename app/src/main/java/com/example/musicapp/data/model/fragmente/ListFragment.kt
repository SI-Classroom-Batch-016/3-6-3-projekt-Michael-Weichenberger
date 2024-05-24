package com.example.musicapp.data.model.fragmente

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.musicapp.MusicAdapter
import com.example.musicapp.R
import com.example.musicapp.data.Datasource
import com.example.musicapp.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: MusicAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Die Layout-Inflation für das Fragment durchführen
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Daten aus der Datenquelle abrufen
        val data = Datasource.data


        // Adapter mit den Daten und dem Navigation Controller erstellen
        adapter = MusicAdapter(data, findNavController())


        // Adapter an das RecyclerView des Fragments setzen
        binding.MusicRV.adapter = adapter
    }
}