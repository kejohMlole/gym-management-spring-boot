package com.kenneth.gymmanagement.repository;

import com.kenneth.gymmanagement.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {

    // Q9: Trainers with no classes
    @Query("SELECT t FROM Trainer t WHERE t.gymClasses IS EMPTY")
    List<Trainer> findTrainersWithNoClasses();
}
