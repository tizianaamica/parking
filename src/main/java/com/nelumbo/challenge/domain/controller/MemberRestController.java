package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.model.Member;
import com.nelumbo.challenge.domain.model.Parking;
import com.nelumbo.challenge.domain.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/createMember")
    public Member createMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

}
