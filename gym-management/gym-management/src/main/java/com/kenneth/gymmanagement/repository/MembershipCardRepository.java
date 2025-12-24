package com.kenneth.gymmanagement.repository;

import com.kenneth.gymmanagement.entity.MembershipCard;
import com.kenneth.gymmanagement.enums.MembershipStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MembershipCardRepository extends JpaRepository<MembershipCard, Long> {

    // Q4: Find expired memberships
    List<MembershipCard> findByEndDateBefore(LocalDate date);

    // Q5: Find active memberships
    List<MembershipCard> findByStatus(MembershipStatus status);
}
