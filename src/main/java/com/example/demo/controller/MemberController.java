package com.example.demo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

@RequestMapping("/member")
@RestController
public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@PostMapping("/insert")
	public Member insert(@RequestBody Map<String, String> map) 
	{
		return memberRepository.save(new Member(Long.parseLong(map.get("id")), map.get("password"),map.get("name"), map.get("email"), Integer.parseInt((map.get("grade")))));
	}

}
