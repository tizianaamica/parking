package com.nelumbo.challenge.domain.controller;

import com.nelumbo.challenge.domain.dto.MemberDto;
import com.nelumbo.challenge.domain.model.Member;
import com.nelumbo.challenge.domain.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class MemberRestController {

    private final MemberService memberService;

    private final ModelMapper modelMapper;

    @PostMapping("/createMember")
    @ResponseStatus(CREATED)
    public MemberDto createMember(@RequestBody Member member) {
        return convertToDto(memberService.saveMember(member));
    }

    private MemberDto convertToDto(Member member) {
        return modelMapper.map(member, MemberDto.class);
    }

}
