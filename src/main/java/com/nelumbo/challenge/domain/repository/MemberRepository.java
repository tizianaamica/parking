package com.nelumbo.challenge.domain.repository;

import com.nelumbo.challenge.domain.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {


}
