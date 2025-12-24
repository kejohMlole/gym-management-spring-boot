package com.kenneth.gymmanagement.service.impl;

import com.kenneth.gymmanagement.entity.Trainer;
import com.kenneth.gymmanagement.repository.TrainerRepository;
import com.kenneth.gymmanagement.service.TrainerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {

    private final TrainerRepository trainerRepository;

    @Override
    public Trainer save(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public Trainer getById(Long id) {
        return trainerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trainer not found"));
    }

    @Override
    public List<Trainer> getAll() {
        return trainerRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        trainerRepository.deleteById(id);
    }
}
