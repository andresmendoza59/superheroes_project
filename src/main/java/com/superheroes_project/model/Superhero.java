package com.superheroes_project.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="table_superheroes")
public class Superhero {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String superhero;
    public Superhero() {}
    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setSuperhero(String superhero) {this.superhero = superhero;}
    public String getSuperhero() {return superhero;}
    @Override
    public String toString() {
        return "ID: " + this.getId() + "\n" + "Name: " + this.getName() + "\n" + "Superhero: " + this.getSuperhero();
    }
    @OneToMany(targetEntity = Powers.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_superhero", referencedColumnName = "id")
    private List<Powers> powers;
}