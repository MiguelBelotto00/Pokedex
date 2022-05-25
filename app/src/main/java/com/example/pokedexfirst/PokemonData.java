package com.example.pokedexfirst;

import java.util.ArrayList;

public class PokemonData {
    private String pokemonName;
    private String pokemonImage;
    private String pokemonType;
    private String pokemonRegion;

    public PokemonData(String pokemonName, String pokemonImage, String pokemonType, String pokemonRegion) {
        this.pokemonName = pokemonName;
        this.pokemonImage = pokemonImage;
        this.pokemonType = pokemonType;
        this.pokemonRegion = pokemonRegion;
    }
    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public String getPokemonRegion() {
        return pokemonRegion;
    }

    public void setPokemonRegion(String pokemonRegion) {
        this.pokemonRegion = pokemonRegion;
    }

    public void setPokemonImage(String pokemonImage) {
        this.pokemonImage = pokemonImage;
    }

    public String getPokemonImage() {
        return pokemonImage;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }
}
