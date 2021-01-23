package com.obj.controller;

public class Student {
	
	public String name;
	public int age;
	public int grade;
	public int ban;
	public String addr;
	public double height;
	//여기에 바로 입력해서 초기화 하면 "명시적 초기값"
	
//	{
//		name = "장혜린";
//		age = 26;
//		grade = 2;
//		ban = 6;
//		addr = "경기도 화성시";
//		height = 165.5;
//	}
	
	
	//생성자 추가하기
	//접근제한자(보통 public 사용) 클래스명(){ 로직 (대부분 필드 초기화) }
	//기본 생성자 -> default 값으로 설정되는 것
	public Student() {
		//필드를 초기화함
		//우선순위에 의해 생성자에 의한 초기화가 가장 마지막으로 됨 따라서 출력 시 이 아래 값들이 출력됨
		//우선순위 :JVM기본값 -> 명시적 초기값 -> 데이터 블록(자동으로 실행) -> 생성자 (선택적으로 실행)
		name = "박유현";
		age = 27;
		grade = 1;
		ban = 10;
		addr = "경기도 이천";
		height = 200.5;
		System.out.println("기본 생성자 실행");
		
//		this("신충현",24,1,5,"경기도 안산",188.4);
	}//기본 생성자는 무조건!!! 코드에!!! 작성해주세요!!!!
	
	//매개변수가 있는 생성자
	//외부에서(이 객체를 생성하는 쪽) 데이터를 받아서 초기화하는 생성자
	public Student(String name, int age, int grade, int ban, String addr, double height) {
		//필드 = 매개변수(?) 왜 써논거냐 멤버변수 아님?
		this.name = name;//매개변수와 필드명이 중복됐을 때 this 사용 but 통상적으로 이름을 똑같이 많이 씀
		this.age = age;
		this.grade = grade;
		this.ban = ban;
		this.addr = addr;
		this.height = height;
	}
	
	public Student(String name, int age, String addr, double height) {
		//다른 생성자 호출
		//this();//default 생성자 호출
		this(name, age, 10, 20, addr, height);
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
	}
	
	
	

}
