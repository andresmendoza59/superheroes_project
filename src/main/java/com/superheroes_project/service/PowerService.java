package com.superheroes_project.service;

import com.superheroes_project.model.Powers;
import com.superheroes_project.repository.PowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerService {
    @Autowired
    PowersRepository powersRepository;

    public String addPowers(List<Powers> powers) {
        powersRepository.saveAll(powers);
        return "Powers saved successfully!";
    }
    public String findById(int id) {
        Powers powers = powersRepository.getReferenceById(id);
        return powers.toString();
    }
    public String deletePower(int id) {
        Powers power = powersRepository.getReferenceById(id);
        powersRepository.delete(power);
        return "Power successfully deleted";
    }
}
