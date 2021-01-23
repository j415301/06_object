package com.obj.controller;

public class InItBlockTest {
	
	public String name;
	public int age;
	public double height;
	public final String email;
	public static String data;
	
	//초기화 블록 사용하기
	//객체를 생성할 때마다 실행
	{
		//필드(멤버변수)이 초기값 세팅;
		//연산자 사용이 가능
		//내가 원하는 초기화 값을 설정할 때도 사용 가능
		System.out.println("초기화 블록 실행");//메소드 호출도 가능
		name = "rclass수강생";
		age=19;
		height=180.5;
		email="prince0324@naver.com";
		//근데 사실은 초기화 블록보다 더 간편한 생성자를 많이 씀..ㅎㅎ
		
		//일반 초기화블록에서 static 변수를 초기화할 수 있을까?
		data = "초기화 되나?";
	}
	
	//생성자
	public InItBlockTest() {};
	
	//static 초기화 블록: static으로 선언된 변수를 초기화할 때 사용
	//최초 한 번만 실행
	static {
		System.out.println("static초기화블록");
		//name = "김상현";//error, heap 영역에 있는 데이터를 static에서 접근해서 에러
		//static 필드만 초기화 가능
		data= "코로나 없어져라";
		System.out.println(data);
	}

}
