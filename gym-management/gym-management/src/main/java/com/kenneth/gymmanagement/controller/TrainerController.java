package com.kenneth.gymmanagement.controller;

import com.kenneth.gymmanagement.entity.Trainer;
import com.kenneth.gymmanagement.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainers")
@RequiredArgsConstructor
public class TrainerController {

    private final TrainerService trainerService;

    @PostMapping
    public Trainer create(@RequestBody Trainer trainer) {
        return trainerService.save(trainer);
    }

    @GetMapping("/{id}")
    public Trainer getById(@PathVariable Long id) {
        return trainerService.getById(id);
    }

    @GetMapping
    public List<Trainer> getAll() {
        return trainerService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        trainerService.delete(id);
    }
}
