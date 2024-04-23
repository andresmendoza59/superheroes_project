package com.superheroes_project.repository;

import com.superheroes_project.model.Powers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PowersRepository extends JpaRepository<Powers, Integer> {
}
