package com.superheroes_project.service;

import com.superheroes_project.model.Superhero;
import com.superheroes_project.repository.SuperheroRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SuperheroServiceTest {

    @Mock
    private SuperheroRepository superheroRepository;
    @InjectMocks
    private SuperheroService superheroService;
    private AutoCloseable openMocks;
    private Superhero superhero;
    @BeforeEach
    void setUp() {
        openMocks = MockitoAnnotations.openMocks(this);
        superhero = new Superhero(1, "Bruce Wayne", "Batman");
    }
    @AfterEach
    void tearDown() throws Exception {
        openMocks.close();
    }
    @Test
    void createSuperhero() {
        when(superheroRepository.save(superhero)).thenReturn(superhero);
        String result = superheroService.createSuperhero(superhero);
        assertEquals("Superhero added successfully", result);
        verify(superheroRepository, times(1)).save(superhero);
    }
    @Test
    void createSuperhero2() {
        Superhero superhero = new Superhero(6, "Clark Kent", "Superman");
        when(superheroRepository.save(superhero)).thenReturn(superhero);
        String result = superheroService.createSuperhero(superhero);
        assertEquals("Superhero added successfully", result);
        verify(superheroRepository, times(1)).save(superhero);
    }
    @Test
    void findById() {
        int id = superhero.getId();
        when(superheroRepository.getReferenceById(id)).thenReturn(superhero);
        Superhero result = superheroService.findById(id);
        assertEquals(superhero, result);
        verify(superheroRepository, times(1)).getReferenceById(id);
    }
    @Test
    void findById2() {
        Superhero superhero = new Superhero(3, "Diana Princess", "Wonder Woman");
        int id = superhero.getId();
        when(superheroRepository.getReferenceById(id)).thenReturn(superhero);
        Superhero result = superheroService.findById(id);
        assertEquals(superhero, result);
        verify(superheroRepository, times(1)).getReferenceById(id);
    }
    @Test
    void updateSuperhero() {
        when(superheroRepository.save(superhero)).thenReturn(superhero);
        String result = superheroService.updateSuperhero(superhero);
        assertEquals("Superhero updated successfully", result);
        verify(superheroRepository, times(1)).save(superhero);
    }
    @Test
    void updateSuperhero2() {
        Superhero superhero = new Superhero(5, "Bruce Banner", "Hulk");
        when(superheroRepository.save(superhero)).thenReturn(superhero);
        String result = superheroService.updateSuperhero(superhero);
        assertEquals("Superhero updated successfully", result);
        verify(superheroRepository, times(1)).save(superhero);
    }
    @Test
    void deleteSuperhero() {
        Superhero superhero = new Superhero(1, "Bruce Wayne", "Batman");
        when(superheroRepository.getReferenceById(1)).thenReturn(superhero);
        String result = superheroService.deleteSuperhero(1);
        assertEquals("Superhero successfully eliminated", result);
        verify(superheroRepository, times(1)).delete(superhero);
    }
    @Test
    void deleteSuperhero2() {
        Superhero superhero = new Superhero(2, "Peter Parker", "Spiderman");
        when(superheroRepository.getReferenceById(2)).thenReturn(superhero);
        String result = superheroService.deleteSuperhero(2);
        assertEquals("Superhero successfully eliminated", result);
        verify(superheroRepository, times(1)).delete(superhero);
    }
}