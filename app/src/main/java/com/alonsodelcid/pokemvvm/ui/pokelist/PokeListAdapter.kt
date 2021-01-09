package com.alonsodelcid.pokemvvm.ui.pokelist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alonsodelcid.pokemvvm.R
import com.alonsodelcid.pokemvvm.model.api.PokeResult
import kotlinx.android.synthetic.main.card_pokemon_search.view.*

class PokeListAdapter(val pokemonClick: (Int) -> Unit): RecyclerView.Adapter<PokeListAdapter.SearchViewHolder>() {
    var pokemonList: List<PokeResult> = emptyList<PokeResult>()

    fun setData(list: List<PokeResult>){
        pokemonList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_pokemon_search, parent,false))
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val pokemon = pokemonList[position]
        holder.itemView.pokemonText.text = "#${position + 1} - ${pokemon.name}"

        holder.itemView.setOnClickListener { pokemonClick(position + 1) }
    }

    class SearchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}