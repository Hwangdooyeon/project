package com.example.demo.member.service;

import com.example.demo.member.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> findMembers();
    Member getMemberByEmail(String email);
    void join(Member member);
}
