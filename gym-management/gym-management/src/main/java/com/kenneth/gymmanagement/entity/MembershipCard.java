package com.kenneth.gymmanagement.entity;

import com.kenneth.gymmanagement.enums.MembershipStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class MembershipCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private MembershipStatus status;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
