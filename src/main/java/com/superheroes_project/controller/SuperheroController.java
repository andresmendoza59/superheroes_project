package com.superheroes_project.controller;

import com.superheroes_project.model.Superhero;
import com.superheroes_project.service.SuperheroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/superheroes")
public class SuperheroController {
    @Autowired
    private SuperheroServices superheroService;

    @PostMapping
    public String createSuperhero(@RequestBody Superhero superhero) {
        return superheroService.createSuperhero(superhero);
    }
    @PutMapping("{id}")
    public String updateSuperhero(@RequestBody Superhero superhero, @PathVariable int id) {
        return superheroService.updateSuperhero(id, superhero);
    }
    @DeleteMapping("/{id}")
    public String deleteSuperhero(@PathVariable("id") int id) {
        return superheroService.deleteSuperhero(id);
    }
    @GetMapping("/{id}")
    public String getSuperhero(@PathVariable int id) {
        return superheroService.findById(id);
    }
    @GetMapping
    public List<Superhero> findAll() {return superheroService.findAll();}
}
