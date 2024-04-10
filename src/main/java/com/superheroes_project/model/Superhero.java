package com.superheroes_project.model;

import jakarta.persistence.*;

@Entity
@Table(name="TableSuperheroes")
public class Superhero implements SuperheroInterface {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String powers;
    @Column
    private String superhero;
    public Superhero(int id, String superhero) {
        this.id = id;
        this.superhero = superhero;}

    public Superhero() {}
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPowers(String powers) {
        this.powers = powers;
    }
    public String getPowers() {
        return powers;
    }
    @Override
    public String getSuperhero() {return superhero;}
}