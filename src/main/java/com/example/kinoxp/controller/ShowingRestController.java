package com.example.kinoxp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kinoxp.model.Showing;
import com.example.kinoxp.repository.ShowingRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/showing")
public class ShowingRestController {

    private ShowingRepository showingRepository;

    public ShowingRestController(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }
    
    @GetMapping
    public List<Showing> getAllShowings() {
        return showingRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Showing> getShowingById(@PathVariable int id) {
        return showingRepository.findById(id);
    }

    @GetMapping("/movie/{movieId}")
    public List<Showing> getShowingByMovieId(@PathVariable int movieId) {
        
        List<Showing> showingsForMovie = new ArrayList<Showing>();
        
        for (Showing showing : showingRepository.findAll()) {
            int idInList = showing.getMovie().getId();
            
            if (idInList == movieId) {
                showingsForMovie.add(showing);
            }
        }

        return showingsForMovie;
    }

    @PostMapping
    public void createShowing(@RequestBody Showing showing) {
        showingRepository.save(showing);
    }

    @PutMapping("/{id}")
    public void updateShowing(@RequestBody Showing showing, @PathVariable int id) {
        showing.setId(id);
        showingRepository.save(showing);
    }

    @DeleteMapping("/{id}")
    public void deleteShowing(@PathVariable int id) {
        showingRepository.deleteById(id);
    }
}