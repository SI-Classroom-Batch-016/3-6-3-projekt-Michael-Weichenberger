package com.example.musicapp.data.model.fragmente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.musicapp.R

class DetailFragment : Fragment() {
    private lateinit var songTitleTextView: TextView
    private lateinit var artistTextView: TextView
    private lateinit var playButton: Button
    private lateinit var backBtn: Button
    private lateinit var timeTv: TextView
    private lateinit var albumArtImageView: ImageView
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        songTitleTextView = view.findViewById(R.id.songTitleTextView)
        artistTextView = view.findViewById(R.id.artistTextView)
        playButton = view.findViewById(R.id.playButton)
        backBtn = view.findViewById(R.id.BackBTN)
        timeTv = view.findViewById(R.id.TimeTV)
        albumArtImageView = view.findViewById(R.id.albumArtImageView)


        val songTitle = args.titel
        val artistName = args.Interpret
        val duration = args.Dauer
        val albumArt = args.Albumcover


        songTitleTextView.text = songTitle
        artistTextView.text = artistName
        timeTv.text = duration
        albumArtImageView.setImageResource(albumArt)

        backBtn.setOnClickListener {
            findNavController().navigateUp()
        }

        return view
    }
}