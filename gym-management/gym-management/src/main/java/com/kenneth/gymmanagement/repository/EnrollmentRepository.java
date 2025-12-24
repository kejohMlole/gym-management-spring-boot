package com.kenneth.gymmanagement.repository;

import com.kenneth.gymmanagement.entity.Enrollment;
import com.kenneth.gymmanagement.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    // Q2: Find members enrolled in a class
    @Query("SELECT e.member FROM Enrollment e WHERE e.gymClass.id = :classId")
    List<Member> findMembersByClassId(@Param("classId") Long classId);

    // Q3: Attendance count per member
    @Query("SELECT e.member.id, SUM(e.attendanceCount) FROM Enrollment e GROUP BY e.member.id")
    List<Object[]> getAttendanceCountPerMember();

    // Q7: Count enrollments per class
    @Query("SELECT COUNT(e) FROM Enrollment e WHERE e.gymClass.id = :classId")
    Long countEnrollmentsPerClass(@Param("classId") Long classId);

    // Q8: Members attended more than X classes
    List<Enrollment> findByAttendanceCountGreaterThan(int count);
}
