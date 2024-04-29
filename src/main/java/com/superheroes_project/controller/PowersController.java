package com.superheroes_project.controller;

import com.superheroes_project.model.Powers;
import com.superheroes_project.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/powers")
public class PowersController {
    @Autowired
    PowerService powerService;
    @GetMapping
    public String getPowers(@RequestParam int id) {return powerService.findById(id);}
    @PostMapping
    public String addPower(@RequestBody List<Powers> powers) {
        return powerService.addPowers(powers);
    }
    @DeleteMapping("/{id}")
    public String deletePower(@PathVariable int id) {
        return powerService.deletePower(id);
    }
}
