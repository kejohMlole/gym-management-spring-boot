package com.kenneth.gymmanagement.service.impl;

import com.kenneth.gymmanagement.entity.GymClass;
import com.kenneth.gymmanagement.repository.GymClassRepository;
import com.kenneth.gymmanagement.service.GymClassService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class GymClassServiceImpl implements GymClassService {

    private final GymClassRepository gymClassRepository; // MUST be final ✅

    @Override
    public GymClass save(GymClass gymClass) {
        return gymClassRepository.save(gymClass);
    }

    @Override
    public GymClass getById(Long id) {
        return gymClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gym class not found"));
    }

    @Override
    public List<GymClass> getAll() {
        return gymClassRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        gymClassRepository.deleteById(id);
    }
}
