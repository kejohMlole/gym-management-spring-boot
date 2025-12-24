package com.kenneth.gymmanagement.service.impl;

import com.kenneth.gymmanagement.entity.Member;
import com.kenneth.gymmanagement.repository.MemberRepository;
import com.kenneth.gymmanagement.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member getById(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}
