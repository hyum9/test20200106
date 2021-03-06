package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name = "member")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="grade")
	private int grade;
	
	@Column(name="language")
	private int language;
	
	@Column(name="math")
	private int math;
	
	@Column(name="science")
	private int science;
	
	@Column(name="socialstudy")
	private int socialstudy;
	
	@CreationTimestamp
	private Date createdAt;
	
	public Member()
	{
		
	}
	
	public Member(long id, String password, String name, String email, int grade, int language, int math, int science, int socialstudy, Date createdAt) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.email=email;
		this.grade=grade;
		this.language=language;
		this.math=math;
		this.science=science;
		this.socialstudy=socialstudy;
		this.createdAt=createdAt;
	}
	
	public Member(long id, String password, String name, String email, int grade)
	{
		this.id=id;
		this.password=password;
		this.name=name;
		this.email=email;
		this.grade=grade;
		this.language=0;
		this.math=0;
		this.science=0;
		this.socialstudy=0;
		this.createdAt = new Date();
	}
	
	public void setLanguage(int language)
	{
		this.language=language;
	}
	public void setMath(int math)
	{
		this.math=math;
	}
	public void setScience(int science)
	{
		this.science=science;
	}
	public void setSocialstudy(int socialstudy)
	{
		this.socialstudy=socialstudy;
	}
	
	
	
	
	
}
