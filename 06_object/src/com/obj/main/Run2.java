package com.obj.main;

import com.obj.controller.FunctionalTest;

public class Run2 {
	
	public static void main(String[] args) {
		
		//1. 반환형이 있고 매개변수 없는 메소드
//		double result = new FunctionalTest().cal1();//기능형클래스는 이렇게 객체를 만든다.
//							 						//멤버~~ 는 모두 객체를 만들어서 사용해야 함
//		System.out.println(result);
//		System.out.println(new FunctionalTest().cal1());
		
		//2. 매개변수가 있고 반환형이 없는 메소드
		//매개변수 있는 생성자 호출
		FunctionalTest ft = new FunctionalTest();
//		ft.cal2(20, 20, '*');
		//double result = ft.cal2(10, 20, '*');//error:반환형이 없기 때문
		//System.out.println(ft.cal2(10, 20, '*');//void기 때문에 반환형이 없음(2교시 다시 듣기)
		//ft.cal2(10, 20);//error //매개변수가 있는 메소드를 호출할 때는 반드시 선언된 매개변수값을 모두 전달해야함(매개변수의 자료형과 개수를 꼭 맞춰줘야 함)
//		double result = new FunctionalTest().cal1()+300;//cal1은 반환형이 있는 메소드이므로 가능
		
		//3. 반환형이 없고 매개변수 없는 메소드
//		ft.cal3();
		
		//4. 반환형이 있고 매개변수도 있는 메소드
		double result = ft.cal4(20, 30, '*');
		System.out.println("계산 결과: "+result);
		System.out.println("병승이가 계산한 결과 : "+ft.cal4(20, 20, '+'));
	}

}
