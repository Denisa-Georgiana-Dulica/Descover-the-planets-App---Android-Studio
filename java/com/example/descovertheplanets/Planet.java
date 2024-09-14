package com.example.descovertheplanets;

public class Planet
{
    String planetName;
    String nrMoons;
    int image;

    public Planet(String planetName, String nrMoons, int image) {
        this.planetName = planetName;
        this.nrMoons = nrMoons;
        this.image = image;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getNrMoons() {
        return nrMoons;
    }

    public int getImage() {
        return image;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setNrMoons(String nrMoons) {
        this.nrMoons = nrMoons;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
