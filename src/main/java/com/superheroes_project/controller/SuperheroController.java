package com.superheroes_project.controller;

import com.superheroes_project.model.Superhero;
import com.superheroes_project.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SuperheroController {
    @Autowired
    private SuperheroService superheroService;

    @PostMapping("/create")
    public String createSuperhero(@RequestBody Superhero superhero) {
        return superheroService.createSuperhero(superhero);
    }
    @PutMapping("/superheroes")
    public String updateSuperhero(@RequestBody Superhero superhero) {
        return superheroService.updateSuperhero(superhero);
    }
    @DeleteMapping("/superheroes/{id}")
    public String deleteSuperhero(@PathVariable("id") int id) {
        return superheroService.deleteSuperhero(id);
    }
    @RequestMapping("/all/{id}")
    public Superhero getSuperhero(@PathVariable("id") int id) {
        return superheroService.findById(id);
    }
}