package com.kenneth.gymmanagement.service;

import com.kenneth.gymmanagement.entity.Trainer;

import java.util.List;

public interface TrainerService {

    Trainer save(Trainer trainer);

    Trainer getById(Long id);

    List<Trainer> getAll();

    void delete(Long id);
}
