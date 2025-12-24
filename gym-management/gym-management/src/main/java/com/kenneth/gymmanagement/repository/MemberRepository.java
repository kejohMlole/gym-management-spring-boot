package com.kenneth.gymmanagement.repository;

import com.kenneth.gymmanagement.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
