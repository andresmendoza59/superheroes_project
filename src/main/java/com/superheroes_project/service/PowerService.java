package com.superheroes_project.service;

import com.superheroes_project.model.Powers;
import com.superheroes_project.repository.PowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerService implements Services {
    @Autowired
    PowersRepository powersRepository;

    public String addPower(Powers power) {
        powersRepository.save(power);
        return "Power saved successfully!";
    }
    public String findById(int id) {
        Powers powers = powersRepository.getReferenceById(id);
        return powers.toString();
    }
    public List<Powers> findAll() {
        return powersRepository.findAll();
    }
    public String updatePower(int id, Powers power) {
        Powers existingPower = powersRepository.getReferenceById(id);
        existingPower.setPower(power.getPower());
        existingPower.setDateAcquisitionPower(power.getDateAcquisitionPower());
        existingPower.setState(power.getState());
        existingPower.setPowerLevel(power.getPowerLevel());
        return "Power successfully updated.";
    }
    public String deletePower(int id) {
        Powers power = powersRepository.getReferenceById(id);
        powersRepository.delete(power);
        return "Power successfully deleted";
    }
}
