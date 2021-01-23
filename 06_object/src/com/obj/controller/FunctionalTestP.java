package com.obj.controller;

import java.util.Scanner;

public class FunctionalTestP {
	//기능 제공용 클래스
	
	//1. 반환형이 있고 매개변수 없는 메소드
	public double cal1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int su = sc.nextInt();
		System.out.print("수2: ");
		int su2 = sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2;
		}
		return result;
	}
	
	//2. 매개변수가 있고 반환형이 없는 메소드
	public void cal2(int su, int su2, char op) {
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2;
		}
		System.out.println(result);
	}
	
	//3. 반환형이 없고 매개변수 없는 메소드
	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int su = sc.nextInt();
		System.out.print("수2: ");
		int su2 = sc.nextInt();
		System.out.print("연산자: ");
		char op = sc.next().charAt(0);
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2;
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
			case '/': result = (double)su / su2;
		}
		return result;
	}
}
