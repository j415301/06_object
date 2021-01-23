package com.obj.controller;

public class BasicObjTest {//클래스 선언부
//public: 접근 제한자
//class 클래스 선언
//BasicObjTest: 클래스명
	
	//1. 필드(멤버변수): 데이터 저장 (생략 가능)
	//2. 생성자: 클래스를 인스턴스화 시킬 때 실행하는 것, 객체로 생성할 때 사용 (생략 불가 -> 생략했을 시 jvm이 컴파일 할 때 자동으로 생성)
	//3. 메소드: 기능 (생략 가능)
	
	DefaultTest d=new DefaultTest();
	//default 접근 제한자를 사용한 클래스는 같은 패키지에서만 사용할 수 있는 클래스다
	
	public void fieldTest() {
		FieldTest fieldTest = new FieldTest();//run 클래스에 있는 fieldTest 객체의 주소와 다름
		//자료형 FieldTest(클래스), 변수명 fieldTest
		//new를 통해 객체 생성 후 heap에 변수의 저장공간을 만들고, FieldTest()에 변수의 주소를 저장해 변수에 대입함 (괄호가 주소를 불러움)
		System.out.println(fieldTest.name);
		System.out.println(fieldTest.age);//default 접근제한자: 같은 패키지에 있는 것이므로 접근 가능
		//System.out.println(fieldTest.email);//error: not visible -> 접근제한자(private)에 의해 차단됨
		
		
	}
	

}
