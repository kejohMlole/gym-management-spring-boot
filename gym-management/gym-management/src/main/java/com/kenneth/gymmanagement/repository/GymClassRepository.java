package com.kenneth.gymmanagement.repository;

import com.kenneth.gymmanagement.entity.GymClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface GymClassRepository extends JpaRepository<GymClass, Long> {

    // Q1: Find classes taught by a trainer
    List<GymClass> findByTrainerId(Long trainerId);

    // Q6: Find classes on a specific day
    List<GymClass> findByDayOfWeek(String dayOfWeek);

    // Q10: Find upcoming classes
    List<GymClass> findByStartTimeAfter(LocalDateTime time);
}
