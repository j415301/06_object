package com.obj.controller;

import java.util.Scanner;

public class FunctionalTestP {
	//��� ������ Ŭ����
	
	//1. ��ȯ���� �ְ� �Ű����� ���� �޼ҵ�
	public double cal1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��1: ");
		int su = sc.nextInt();
		System.out.print("��2: ");
		int su2 = sc.nextInt();
		System.out.print("������: ");
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
	
	//2. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
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
	
	//3. ��ȯ���� ���� �Ű����� ���� �޼ҵ�
	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��1: ");
		int su = sc.nextInt();
		System.out.print("��2: ");
		int su2 = sc.nextInt();
		System.out.print("������: ");
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
	
	//4. ��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ�
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
