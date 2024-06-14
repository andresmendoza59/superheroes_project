package com.superheroes_project.model;

import com.superheroes_project.model.interfaces.PowersInterface;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="powers")
public class Powers implements PowersInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int power_id;
    private String power;
    private LocalDate DateAcquisitionPower;
    private String state;
    private int powerLevel;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "superhero_power", joinColumns = {@JoinColumn(name = "power_id", referencedColumnName = "power_id")},
                inverseJoinColumns = {@JoinColumn(name = "superhero_id", referencedColumnName = "id")})
    private Set<Superhero> superheroes;

    public int getPower_id() {return power_id;}
    public void setPower_id(int power_id) {this.power_id = power_id;}
    public String getPower() {return power;}
    public void setPower(String power) {this.power = power;}
    public LocalDate getDateAcquisitionPower() {return DateAcquisitionPower;}
    public void setDateAcquisitionPower(LocalDate dateAcquisitionPower) {this.DateAcquisitionPower = dateAcquisitionPower;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public int getPowerLevel() {return powerLevel;}
    public void setPowerLevel(int powerLevel) {this.powerLevel = powerLevel;}
    public Set<Superhero> getSuperheroes() {return superheroes;}
    public void setSuperheroes(Set<Superhero> superheroes) {this.superheroes = superheroes;}
    @Override
    public String toString() {
        return "ID: " + this.getPower_id() + "\n" + "Power: " + this.getPower() + "\n" + "Acquisition Date Power: " +
                this.getDateAcquisitionPower() + "\n" + "State: " + this.getState() + "\n" + "Power Level: " +
                this.getPowerLevel();
    }
}
