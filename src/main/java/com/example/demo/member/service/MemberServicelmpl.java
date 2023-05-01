package com.example.demo.member.service;

import com.example.demo.member.entity.Member;
import com.example.demo.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServicelmpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberByEmail(String email) {
        return memberRepository.findByEmail(email).orElse(null);
    }

    @Override
    public void join(Member member) {
       memberRepository.save(member);
    }
}
