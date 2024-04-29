package com.superheroes_project.model;

import jakarta.persistence.*;

@Entity
@Table(name="powers")
public class Powers {
    @Id
    @Column(name = "id_powers")
    private int power_id;
    @Column(name = "power")
    private String power;
    @Column(name = "id_superhero")
    private int id_superhero;
    public int getPower_id() {return power_id;}
    public void setPower_id(int power_id) {this.power_id = power_id;}
    public String getPower() {return power;}
    public void setPower(String power) {this.power = power;}
    public void setId_superhero(int id_superhero) {this.id_superhero = id_superhero;}
    public int getId_superhero() {return id_superhero;}
    @Override
    public String toString() {
        return "Powers{" +
                "power_id=" + power_id +
                ", power='" + power + '\'' +
                ", id_superhero=" + id_superhero +
                '}';
    }
}
