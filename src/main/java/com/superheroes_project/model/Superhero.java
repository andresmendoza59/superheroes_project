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
    public Superhero(int id, String superhero) {
        this.id = id;
        this.superhero = superhero;}
    public Superhero() {}
    public int getId() {return id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSuperhero() {return superhero;}
    @OneToMany(targetEntity = Powers.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_superhero", referencedColumnName = "id")
    private List<Powers> powers;
}