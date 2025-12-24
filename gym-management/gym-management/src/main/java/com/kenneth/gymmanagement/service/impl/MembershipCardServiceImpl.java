package com.kenneth.gymmanagement.service.impl;

import com.kenneth.gymmanagement.entity.MembershipCard;
import com.kenneth.gymmanagement.repository.MembershipCardRepository;
import com.kenneth.gymmanagement.service.MembershipCardService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MembershipCardServiceImpl implements MembershipCardService {

    private final MembershipCardRepository membershipCardRepository;

    @Override
    public MembershipCard save(MembershipCard card) {
        return membershipCardRepository.save(card);
    }

    @Override
    public MembershipCard getById(Long id) {
        return membershipCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membership card not found"));
    }

    @Override
    public List<MembershipCard> getAll() {
        return membershipCardRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        membershipCardRepository.deleteById(id);
    }
}
