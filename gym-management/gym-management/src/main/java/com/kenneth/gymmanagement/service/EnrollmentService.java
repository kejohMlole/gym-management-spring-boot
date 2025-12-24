package com.kenneth.gymmanagement.service;

import com.kenneth.gymmanagement.entity.Enrollment;

import java.util.List;

public interface EnrollmentService {

    Enrollment save(Enrollment enrollment);

    Enrollment getById(Long id);

    List<Enrollment> getAll();

    void delete(Long id);
}
