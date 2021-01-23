package com.obj.main;

import com.obj.controller.FunctionalTestP;

public class Run2P {
	
	public static void main(String[] args) {
		//1. 반환형이 있고 매개변수 없는 메소드
//		double result = new FunctionalTestP().cal1();
//		System.out.println(result);
		//System.out.println(new FunctionalTestP().cal1());
		
		//2. 매개변수가 있고 반환형이 없는 메소드
		FunctionalTestP fc = new FunctionalTestP();
//		fc.cal2(10, 20, '*');
		
		//3. 반환형이 없고 매개변수 없는 메소드
//		fc.cal3();
		
		//4. 반환형이 있고 매개변수도 있는 메소드
		double result = fc.cal4(5, 3, '/');
		System.out.println(result);
		System.out.println(fc.cal4(20,5,'/'));
	}
}
