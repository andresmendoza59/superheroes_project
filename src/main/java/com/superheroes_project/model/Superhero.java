package com.superheroes_project.model;

import com.superheroes_project.model.interfaces.SuperheroInterface;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="table_superheroes")
public class Superhero implements SuperheroInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "type_id")
    private String typeId;
    @Column(name = "name")
    private String name;
    @Column(name = "alias")
    private String alias;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @ManyToMany(mappedBy = "superheroes", fetch = FetchType.LAZY)
    private Set<Powers> powers;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTypeId() {return typeId;}
    public void setTypeId(String typeId) {this.typeId = typeId;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAlias() {return alias;}
    public void setAlias(String alias) {this.alias = alias;}
    public LocalDate getCreationDate() {return creationDate;}
    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}
    public Set<Powers> getPowers() {return powers;}
    public void setPowers(Set<Powers> powers) {this.powers = powers;}
    @Override
    public String toString() {
        return "ID: " + this.getId() + "\n" + "Type ID: " + this.getTypeId() + "\n" + "Name: " + this.getName() + "\n" +
                "Alias: " + this.getAlias() + "\n" + "Creation date: " + this.getCreationDate() + "\n" + "Powers: " +
                this.getPowers();
        }
}
