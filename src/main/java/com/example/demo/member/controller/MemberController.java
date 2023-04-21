package com.example.demo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Member;

@Controller
public class MemberController {
//private final Memberservice memberservice;

  @GetMapping("/member/new")
    private String createForm(){
      return "member/createMemberForm";
  }

}
