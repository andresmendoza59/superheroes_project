package com.superheroes_project.service;

import com.superheroes_project.model.Superhero;
import com.superheroes_project.repository.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperheroService {
    @Autowired
    private SuperheroRepository superheroRepository;
    public String createSuperhero(Superhero superhero) {
        superheroRepository.save(superhero);
        return "Superhero added successfully";
    }
    public Superhero findById(int id) {
        return superheroRepository.getReferenceById(id);
    }
    public String updateSuperhero(Superhero superhero) {
        superheroRepository.save(superhero);
        return "Superhero updated successfully";
    }
    public String deleteSuperhero(int id) {
        Superhero superhero = superheroRepository.getReferenceById(id);
        superheroRepository.delete(superhero);
        return "Superhero successfully eliminated";
    }
}
