package com.example.musicapp.data.model.fragmente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.musicapp.R
import com.example.musicapp.databinding.FragmentLoginBinding

// Definition der LoginFragment-Klasse, die von Fragment erbt
class LoginFragment : Fragment() {


    // Die Binding-Variable für den LoginFragment
    private lateinit var binding: FragmentLoginBinding


    // Methode zum Erstellen der Fragment-Ansicht
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    // Methode, die nach der Erstellung der Ansicht aufgerufen wird
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Klickereignis für den "Anmelden" Button
        binding.AnmeldenBTN.setOnClickListener {
            findNavController().navigate(R.id.anmeldenFragment)
        }

        // Klickereignis für den "Registrieren" Button
        binding.RegistrierenBTN.setOnClickListener {
            findNavController().navigate(R.id.anmeldenFragment)
        }
    }
}