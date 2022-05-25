package com.example.pokedexfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerPokemonData recyclerPokemonData;
    ArrayList<PokemonData> pokemonDataArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        recyclerPass();

        recyclerView.setAdapter(recyclerPokemonData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
        recyclerPokemonData.notifyDataSetChanged();

        pokemonDataArrayList.add(new PokemonData("Bulbasaur","https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png","Planta/Veneno","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Ivysaur","https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png","Planta/Veneno","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Venusar","https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png","Planta/Veneno","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Charmander","https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png","Fuego","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Charmeleon","https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png","Fuego","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Charizard","https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png","Fuego/Volador","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Squirtle","https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png","Agua","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Wartortle","https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png","Agua","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Blastoise","https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png","Agua","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Caterpie","https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png","Bicho","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Metapod","https://assets.pokemon.com/assets/cms2/img/pokedex/full/011.png","Bicho","Kanto"));
        pokemonDataArrayList.add(new PokemonData("Butterfree","https://assets.pokemon.com/assets/cms2/img/pokedex/full/012.png","Bicho/Volador","Kanto"));
    }
    void recyclerPass(){
    pokemonDataArrayList = new ArrayList<>();
    recyclerView = findViewById(R.id.rvPokedex);
    recyclerPokemonData = new RecyclerPokemonData(pokemonDataArrayList,this);

    }
}