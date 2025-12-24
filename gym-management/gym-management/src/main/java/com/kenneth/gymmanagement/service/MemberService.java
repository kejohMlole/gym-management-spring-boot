package com.kenneth.gymmanagement.service;

import com.kenneth.gymmanagement.entity.Member;

import java.util.List;

public interface MemberService {

    Member save(Member member);

    Member getById(Long id);

    List<Member> getAll();

    void delete(Long id);
}
