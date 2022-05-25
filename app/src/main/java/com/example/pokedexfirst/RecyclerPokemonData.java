package com.example.pokedexfirst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerPokemonData extends RecyclerView.Adapter<RecyclerPokemonData.ShowPokemons>{
    ArrayList<PokemonData> listaPokemon;
    Context context;

    public RecyclerPokemonData(ArrayList<PokemonData> listaPokemon,Context context){
        this.listaPokemon = listaPokemon;
        this.context = context;
    }
    //Creacion de vista
    @NonNull
    @Override
    public RecyclerPokemonData.ShowPokemons onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pokemons, parent, false);
        ShowPokemons showPokemons = new ShowPokemons(view);
        return showPokemons;
    }
    //Pasar datos a la vista
    @Override
    public void onBindViewHolder(@NonNull RecyclerPokemonData.ShowPokemons holder, int position) {
      PokemonData pokemonData2= listaPokemon.get(position);
        Picasso.get().load(pokemonData2.getPokemonImage()).into(holder.imagePokemon);
      holder.pokemonName.setText(pokemonData2.getPokemonName());
      holder.pokemonRegion.setText(pokemonData2.getPokemonRegion());
      holder.pokemonType.setText(pokemonData2.getPokemonType());
    }

    //Longitud de lista
    @Override
    public int getItemCount() {
        return listaPokemon.size();
    }
    //Intanciar la lista
    public class ShowPokemons extends RecyclerView.ViewHolder {
        ImageView imagePokemon;
        TextView pokemonName,pokemonType,pokemonRegion;
        public ShowPokemons(@NonNull View itemView) {
            super(itemView);
            imagePokemon = itemView.findViewById(R.id.ivPokemonImage);
            pokemonName = itemView.findViewById(R.id.tvPokemonName);
            pokemonType = itemView.findViewById(R.id.tvPokemonType);
            pokemonRegion = itemView.findViewById(R.id.tvPokemonRegion);
        }
    }
}
