package com.kenneth.gymmanagement.service;

import com.kenneth.gymmanagement.entity.GymClass;

import java.util.List;

public interface GymClassService {

    GymClass save(GymClass gymClass);

    GymClass getById(Long id);

    List<GymClass> getAll();

    void delete(Long id);
}
