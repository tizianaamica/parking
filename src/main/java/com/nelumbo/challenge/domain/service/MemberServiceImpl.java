package com.nelumbo.challenge.domain.service;

import com.nelumbo.challenge.domain.model.Member;
import com.nelumbo.challenge.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public Member saveMember(Member member) {
        Member createMember = new Member();
        createMember.setMemberName(member.getMemberName());
        createMember.setMemberEmail(member.getMemberEmail());
        return memberRepository.save(createMember);
    }
}
