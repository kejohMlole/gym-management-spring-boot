package com.kenneth.gymmanagement.controller;

import com.kenneth.gymmanagement.entity.GymClass;
import com.kenneth.gymmanagement.service.GymClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
@RequiredArgsConstructor
public class GymClassController {

    private final GymClassService gymClassService;

    @PostMapping
    public GymClass create(@RequestBody GymClass gymClass) {
        return gymClassService.save(gymClass);
    }

    @GetMapping("/{id}")
    public GymClass getById(@PathVariable Long id) {
        return gymClassService.getById(id);
    }

    @GetMapping
    public List<GymClass> getAll() {
        return gymClassService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        gymClassService.delete(id);
    }
}
