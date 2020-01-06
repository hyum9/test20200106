package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	
	@PostMapping("/login")
	public Member insert(@RequestBody Map<String, String> map) 
	{
		return memberRepository.save(new Member(Long.parseLong(map.get("id")), map.get("password"),map.get("name"), map.get("email"), Integer.parseInt((map.get("grade")))));
	}
	
	@GetMapping("/select")
	public List<Member> selectAll()
	{
		return memberRepository.findAll();
	}
	
	@GetMapping("/select/{id}")
	public Member selectOnd(@PathVariable("id") long id)
	{
		return memberRepository.findById(id).orElse(null);
	}
	
	@PostMapping("/updatelanguage/{id}")
	public Member updatelanguage(@PathVariable("id") long id, @RequestBody Map<String, String> map)
	{
		Member member = memberRepository.findById(id).orElse(null);
        member.setLanguage(Integer.parseInt(map.get("language")));
        return memberRepository.save(member);
	}
	
	
	@PostMapping("/updatemath/{id}")
	public Member updateMath(@PathVariable("id") long id, @RequestBody Map<String, String> map)
	{
		Member member = memberRepository.findById(id).orElse(null);
        member.setMath(Integer.parseInt(map.get("math")));
        return memberRepository.save(member);
	}
	
	
	@PostMapping("/updatescience/{id}")
	public Member updateScience(@PathVariable("id") long id, @RequestBody Map<String, String> map)
	{
		Member member = memberRepository.findById(id).orElse(null);
        member.setScience(Integer.parseInt(map.get("science")));
        return memberRepository.save(member);
	}
	
	
	
	@PostMapping("/updatesocialstudy/{id}")
	public Member updateSocialstudy(@PathVariable("id") long id, @RequestBody Map<String, String> map)
	{
		Member member = memberRepository.findById(id).orElse(null);
        member.setSocialstudy(Integer.parseInt(map.get("socialstudy")));
        return memberRepository.save(member);
	}
}
