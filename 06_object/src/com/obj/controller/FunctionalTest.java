package com.obj.controller;

import java.util.Scanner;

public class FunctionalTest {
	//기능 제공용 클래스: 멤버변수 없이 매소드만 쭈욱 있는 클래스

	
	//계산기 기능을 추가해보자!
	//수 2개, 연산자, 결과값
	
	//1. 반환형이 있고 매개변수 없는 메소드
	//반환형은 무조건 한 개만 가능(ex. public double, String, int cal1(){} 불가)
	//같은 자료형인 여러개의 데이터를 리턴할려면? 배열 타입 선언
	//여러개의 자료형과 여러개의 데이터를 리턴하려면? 클래스 타입 선언
	public double cal1() {//멤버메소드
						  //중괄호 안에 꼭 return이 있어야 함, return이 없으면 에러가 남
		Scanner sc = new Scanner(System.in);//스캐너 객체를 보관할 수 있는 변수 선언, new Scanner(System.in): 생성자
		System.out.print("정수입력: ");//System 클래스의 객체에서 out이라는 public static 멤버변수의 PrintStream 클래스의 print매소드 호출/실행해!
		//~~~(): 매소드 호출/실행
		int su = sc.nextInt(); //sc 클래스 객체의 멤버변수 중 nextInt 매소드 실행해
		System.out.print("정수입력: ");
		int su2 =sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		double result = 0.0; //초기화 하는 이유는 메소드 내의 지역변수는 무조건 초기화해야 하기 때문
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2; break;
		}
		return result;//자신을 호출한 곳으로 값(return 값)을 보내주는 코드
	}
	
	//2. 매개변수가 있고 반환형이 없는 메소드 구현하기
	//숫자 2개, 연산자, 결과값
	public void cal2(int su, int su2, char op) {
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2; break;
		}
		System.out.println(result);
	}
	
	//3. 반환형이 없고 매개변수 없는 메소드
	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수: ");
		int su = sc.nextInt();//Scanner클래스의 nextInt 매소드 실행해
		System.out.print("수: ");
		int su2 =sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);//Scanner클래스의 next 매소드 실행해서 charAt 메소드를 실행해!
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2; break;
		}
		System.out.println(result);
	}
	
	//4. 반환형이 있고 매개변수도 있는 메소드
	public double cal4(int su, int su2, char op) {
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2; break;
		}
		return result;
	}
}
