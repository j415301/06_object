package com.obj.controller;

public class FieldTest {
	//필드 선언하기
	//접근 제한자(public, protected, (default), private) 자료형 변수명
	
	public String name;
	int age;
	private String email;
	
	public void test() {//void: method 선언
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);//여기에서만 접근 가능
	}
	
	//static 필드(멤버변수) 선언하기
		public static String nickName;
		private static double height;
		
		//final 예약어 상수! 한 개만 입력받고 유지
		//public final char ch=;//error
		//final값을 초기화해주지 않으면 바로 default 값이 들어가서 fix되버림 -> 상수를 만드는 의미가 없음
		
		//but 선언 후 바로 초기화하지 않고 나중에 할 수 있는 방법이 있음
		//필드(멤버변수) 초기화 블록, 생성자를 이용해서 초기화할 수 있음
		public final char ch;
		{
			ch='C';
		}
		//{}: 초기화블록, 초기화 블록 안에서 초기화했더니 에러가 없음

}
