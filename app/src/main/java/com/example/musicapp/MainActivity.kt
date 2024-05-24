package com.example.musicapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.musicapp.databinding.ActivityMainBinding

// Dies ist die Hauptaktivität unserer Musik-App
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    // Die onCreate Methode wird aufgerufen, wenn die Aktivität erstellt wird
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}