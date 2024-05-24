package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.data.Musictitle
import com.example.musicapp.data.model.fragmente.ListFragmentDirections
import com.example.musicapp.databinding.ListItemBinding

class MusicAdapter(
    private val dataset: List<Musictitle>,
    private val navController: NavController
) : RecyclerView.Adapter<MusicAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)


    // Erstellt eine neue Ansicht und zugehörige View Holder-Instanz
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    // Gibt die Anzahl der Elemente im Datensatz zurück
    override fun getItemCount(): Int {
        return dataset.size
    }

    // Verknüpft die Daten mit der View Holder-Instanz für ein bestimmtes Element in der Liste
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        // Setzt die Texte in der Ansicht entsprechend den Daten des Elements
        holder.binding.textViewTitle.text = item.titel
        holder.binding.textViewName.text = item.interpret
        holder.binding.textViewDuration.text = item.dauer.toString()


        // Fügt einen Klicklistener hinzu, der die Navigation zum Detailfragment auslöst
        holder.itemView.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment(
                item.titel, item.interpret, item.dauer.toString(), item.image
            )
            navController.navigate(action)

        }
    }
}