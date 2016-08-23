package com.theIronYard.Animal;


/**
 * Created by chris on 8/12/16.
 */
public class Animal {
    //private String id;
    String name;
    String species;
    String breed;
    String description;
    String color;

    public Animal(String name, String species, String breed, String color, String description) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
        this.description = description;
    }

    public String getName(){ return this.name; }
    public String getSpecies(){ return this.species; }
    public String getBreed(){ return this.breed; }
    public String getDescription(){ return this.description; }
    public String getColor(){ return this.color; }

    /* not sure I need all of these
    public String setName(name){ this.name = name; }
    public String setSpecies(species){ this.species = species; }
    public String setBreed(breed){ this.breed = breed; }
    public String setDescription(description){ this.description = description; }
    public String setColor(color){ this.color = color; }
    */

    @Override
    public String toString() {
       return this.name + ", " + this.species + ", " + this.breed + ", " + this.color;
    }

    public String toString(String verbose){
        return "Name:\t\t\t" + this.name + "\nSpecies:\t\t" + this.species +
                "\nBreed:\t\t\t" + this.breed + "\nColor:\t\t\t" + this.color + "\nDescription:\t" + this.description;
    }
}
