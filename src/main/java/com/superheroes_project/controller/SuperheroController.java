package com.superheroes_project.controller;

import com.superheroes_project.model.Superhero;
import com.superheroes_project.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/superheroes")
public class SuperheroController {
    @Autowired
    private SuperheroService superheroService;

    @PostMapping
    public String createSuperhero(@RequestBody Superhero superhero) {
        return superheroService.createSuperhero(superhero);
    }
    @PutMapping
    public String updateSuperhero(@RequestBody Superhero superhero, @RequestParam int id) {
        return superheroService.updateSuperhero(id, superhero);
    }
    @DeleteMapping("/{id}")
    public String deleteSuperhero(@PathVariable("id") int id) {
        return superheroService.deleteSuperhero(id);
    }
    @GetMapping
    public String getSuperhero(@RequestParam int id) {
        return superheroService.findById(id);
    }
}
