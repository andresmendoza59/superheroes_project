package com.superheroes_project.controller;

import com.superheroes_project.model.Powers;
import com.superheroes_project.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/powers")
public class PowersController {
    @Autowired
    PowerService powerService;
    @GetMapping("/{id}")
    public String getPowers(@PathVariable int id) {return powerService.findById(id);}
    @PostMapping
    public String addPower(@RequestBody Powers power) {
        return powerService.addPower(power);
    }
    @DeleteMapping("/{id}")
    public String deletePower(@PathVariable int id) {
        return powerService.deletePower(id);
    }
    @GetMapping
    public List<Powers> findAllPowers() {return powerService.findAll();}
    @PutMapping("{id}")
    public String updatePower(@PathVariable int id, @RequestBody Powers power) {
        return powerService.updatePower(id, power);
    }
}
