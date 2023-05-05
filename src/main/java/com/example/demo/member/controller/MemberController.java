package com.example.demo.member.controller;

import com.example.demo.member.dto.MemberDto;
import com.example.demo.member.entity.Member;
import com.example.demo.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberservice;
    @Autowired
    public MemberController(MemberService memberservice) {
        this.memberservice = memberservice;
    }

    @GetMapping("/member/new")
    private String createForm() {
        return "member/createMemberForm";

    }
    @PostMapping("/member/new")
    public String create(MemberDto form){
        Member member = new Member();
        member.setName(form.getName());
        member.setEmail(form.getEmail());
        memberservice.join(member);

        return "redirect";
    }
    @GetMapping("/member/list")
    public String list(Model model){
        List<Member> members = memberservice.findMembers();
        model.addAttribute("members",members);
        return "member/memberList";
    }
}
