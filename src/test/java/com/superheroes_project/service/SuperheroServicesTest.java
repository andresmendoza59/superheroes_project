//package com.superheroes_project.service;
//
//import com.superheroes_project.model.Superhero;
//import com.superheroes_project.repository.SuperheroRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class SuperheroServicesTest {
//
//    @Mock
//    private SuperheroRepository superheroRepository;
//    @InjectMocks
//    private SuperheroServices superheroService;
//    private AutoCloseable openMocks;
//    private final Superhero superhero = new Superhero();
//    @BeforeEach
//    void setUp() {
//        openMocks = MockitoAnnotations.openMocks(this);
//        superhero.setId(1);
//        superhero.setName("Bruce Wayne");
//        superhero.setAge(36);
//        superhero.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
//        superhero.setSuperhero("Batman");
//    }
//    @AfterEach
//    void tearDown() throws Exception {
//        openMocks.close();
//    }
//    @Test
//    void createSuperhero() {
//        when(superheroRepository.save(superhero)).thenReturn(superhero);
//        String result = superheroService.createSuperhero(superhero);
//        assertEquals("Superhero added successfully", result);
//        verify(superheroRepository, times(1)).save(superhero);
//    }
//    @Test
//    void createSuperhero2() {
//        superhero.setId(2);
//        superhero.setName("Clark Kent");
//        superhero.setAge(120);
//        superhero.setDescription("Came from another planet and adopted by a farmers family.");
//        superhero.setSuperhero("Superman");
//        when(superheroRepository.save(superhero)).thenReturn(superhero);
//        String result = superheroService.createSuperhero(superhero);
//        assertEquals("Superhero added successfully", result);
//        verify(superheroRepository, times(1)).save(superhero);
//    }
//    @Test
//    void findById() {
//        int id = superhero.getId();
//        when(superheroRepository.getReferenceById(id)).thenReturn(superhero);
//        String result = superheroService.findById(id);
//        assertEquals(superhero.toString(), result);
//        verify(superheroRepository, times(1)).getReferenceById(id);
//    }
//    @Test
//    void findById2() {
//        superhero.setId(3);
//        superhero.setName("Diana Prince");
//        superhero.setAge(200);
//        superhero.setDescription("Was a member of a tribe of women called the Amazons, native to Paradise Island.");
//        superhero.setSuperhero("Wonder Woman");
//        int id = superhero.getId();
//        when(superheroRepository.getReferenceById(id)).thenReturn(superhero);
//        String result = superheroService.findById(id);
//        assertEquals(superhero.toString(), result);
//        verify(superheroRepository, times(1)).getReferenceById(id);
//    }
//    @Test
//    void updateSuperhero() {
//        Superhero new_superhero = new Superhero();
//        new_superhero.setId(4);
//        new_superhero.setName("Travis Scott");
//        new_superhero.setAge(32);
//        new_superhero.setDescription("American rapper, singer, songwriter, and record producer. And now also a superhero");
//        new_superhero.setSuperhero("Batman");
//        when(superheroRepository.getReferenceById(1)).thenReturn(superhero);
//        when(superheroRepository.save(superhero)).thenReturn(superhero);
//        String result = superheroService.updateSuperhero(superhero.getId(), new_superhero);
//        assertEquals("Superhero updated successfully", result);
//        verify(superheroRepository, times(1)).getReferenceById(1);
//        verify(superheroRepository, times(1)).save(superhero);
//    }
//    @Test
//    void updateSuperhero2() {
//        Superhero new_superhero = new Superhero();
//        new_superhero.setId(5);
//        new_superhero.setName("Bruce Banner");
//        new_superhero.setAge(42);
//        new_superhero.setDescription("Had an accidental exposure to gamma rays, giving him powers.");
//        new_superhero.setSuperhero("Hulk");
//        when(superheroRepository.getReferenceById(1)).thenReturn(superhero);
//        when(superheroRepository.save(superhero)).thenReturn(superhero);
//        String result = superheroService.updateSuperhero(superhero.getId(), new_superhero);
//        assertEquals("Superhero updated successfully", result);
//        verify(superheroRepository, times(1)).getReferenceById(1);
//        verify(superheroRepository, times(1)).save(superhero);
//    }
//    @Test
//    void deleteSuperhero() {
//        when(superheroRepository.getReferenceById(1)).thenReturn(superhero);
//        String result = superheroService.deleteSuperhero(1);
//        assertEquals("Superhero successfully eliminated", result);
//        verify(superheroRepository, times(1)).delete(superhero);
//    }
//    @Test
//    void deleteSuperhero2() {
//        superhero.setId(6);
//        superhero.setName("Peter Parker");
//        superhero.setAge(16);
//        superhero.setDescription("Was bitten by a spider.");
//        superhero.setSuperhero("Spiderman");
//        when(superheroRepository.getReferenceById(6)).thenReturn(superhero);
//        String result = superheroService.deleteSuperhero(6);
//        assertEquals("Superhero successfully eliminated", result);
//        verify(superheroRepository, times(1)).delete(superhero);
//    }
//}