package com.superheroes_project.service;

import com.superheroes_project.model.Superhero;
import com.superheroes_project.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroServices implements Services {
    @Autowired
    private SuperheroRepository superheroRepository;
    public String createSuperhero(Superhero superhero) {
        superheroRepository.save(superhero);
        return "Superhero added successfully";
    }
    public String findById(int id) {
        Superhero superhero = superheroRepository.getReferenceById(id);
        return superhero.toString();
    }
    public String updateSuperhero(int id, Superhero superhero) {
        Superhero existingSuperhero = superheroRepository.getReferenceById(id);
        existingSuperhero.setId(superhero.getId());
        existingSuperhero.setName(superhero.getName());
        existingSuperhero.setAge(superhero.getAge());
        existingSuperhero.setDescription(superhero.getDescription());
        existingSuperhero.setSuperhero(superhero.getSuperhero());
        superheroRepository.save(existingSuperhero);
        return "Superhero updated successfully";
    }
    public String deleteSuperhero(int id) {
        Superhero superhero = superheroRepository.getReferenceById(id);
        superheroRepository.delete(superhero);
        return "Superhero successfully eliminated";
    }
}
