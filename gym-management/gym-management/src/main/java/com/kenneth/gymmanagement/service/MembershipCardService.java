package com.kenneth.gymmanagement.service;

import com.kenneth.gymmanagement.entity.MembershipCard;

import java.util.List;

public interface MembershipCardService {

    MembershipCard save(MembershipCard card);

    MembershipCard getById(Long id);

    List<MembershipCard> getAll();

    void delete(Long id);
}
