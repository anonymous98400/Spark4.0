package org.cfs.movieApi.controller;

import org.cfs.movieApi.entity.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class moviesController {
    private Map<Long, Entity> Movies=new HashMap<>();
    private int counterId= 0;

    @GetMapping()
    public ResponseEntity<List<Entity>> getMovies(){
        return ResponseEntity.ok(new ArrayList<>(Movies.values()));
    }

    @PostMapping("{id}")
    public ResponseEntity<Entity>addMovies(@RequestBody Entity moves){
        
    }
}
