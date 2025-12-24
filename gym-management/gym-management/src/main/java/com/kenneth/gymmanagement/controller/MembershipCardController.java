package com.kenneth.gymmanagement.controller;

import com.kenneth.gymmanagement.entity.MembershipCard;
import com.kenneth.gymmanagement.service.MembershipCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/membership-cards")
@RequiredArgsConstructor
public class MembershipCardController {

    private final MembershipCardService membershipCardService;

    @PostMapping
    public MembershipCard create(@RequestBody MembershipCard card) {
        return membershipCardService.save(card);
    }

    @GetMapping("/{id}")
    public MembershipCard getById(@PathVariable Long id) {
        return membershipCardService.getById(id);
    }

    @GetMapping
    public List<MembershipCard> getAll() {
        return membershipCardService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        membershipCardService.delete(id);
    }
}
