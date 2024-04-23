package com.superheroes_project.controller;

import com.superheroes_project.model.Powers;
import com.superheroes_project.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PowersController {
    @Autowired
    PowerService powerService;

    @GetMapping("/getPowers")
    public Powers getPowers(@RequestBody int id) {
        return powerService.findById(id);
    }
    @PostMapping("/addPower")
    public String addPower(@RequestBody List<Powers> powers) {
        return powerService.addPowers(powers);
    }
    @DeleteMapping("/deletePower")
    public String deletePower(int id) {
        return powerService.deletePower(id);
    }
}
