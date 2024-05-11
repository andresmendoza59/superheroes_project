package com.superheroes_project.model;

import com.superheroes_project.model.interfaces.SuperheroInterface;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="table_superheroes")
public class Superhero implements SuperheroInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String description;
    @Column
    private String superhero;
    public Superhero() {}
    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public  void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
    public void setDescription(String description) {this.description = description;}
    public String getDescription() {return description;}
    public void setSuperhero(String superhero) {this.superhero = superhero;}
    public String getSuperhero() {return superhero;}
    @Override
    public String toString() {
        return "ID: " + this.getId() + "\n" + "Name: " + this.getName() + "\n" + "Age: " + this.getAge() +
                "\n" + "Description: " + this.getDescription() + "\n" + "Superhero: " + this.getSuperhero();}
    @OneToMany(targetEntity = Powers.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_superhero", referencedColumnName = "id")
    private List<Powers> powers;
}