package com.obj.controller;

import java.util.Scanner;

public class FunctionalTest {
	//��� ������ Ŭ����: ������� ���� �żҵ常 �޿� �ִ� Ŭ����

	
	//���� ����� �߰��غ���!
	//�� 2��, ������, �����
	
	//1. ��ȯ���� �ְ� �Ű����� ���� �޼ҵ�
	//��ȯ���� ������ �� ���� ����(ex. public double, String, int cal1(){} �Ұ�)
	//���� �ڷ����� �������� �����͸� �����ҷ���? �迭 Ÿ�� ����
	//�������� �ڷ����� �������� �����͸� �����Ϸ���? Ŭ���� Ÿ�� ����
	public double cal1() {//����޼ҵ�
						  //�߰�ȣ �ȿ� �� return�� �־�� ��, return�� ������ ������ ��
		Scanner sc = new Scanner(System.in);//��ĳ�� ��ü�� ������ �� �ִ� ���� ����, new Scanner(System.in): ������
		System.out.print("�����Է�: ");//System Ŭ������ ��ü���� out�̶�� public static ��������� PrintStream Ŭ������ print�żҵ� ȣ��/������!
		//~~~(): �żҵ� ȣ��/����
		int su = sc.nextInt(); //sc Ŭ���� ��ü�� ������� �� nextInt �żҵ� ������
		System.out.print("�����Է�: ");
		int su2 =sc.nextInt();
		System.out.print("������: ");
		char op = sc.next().charAt(0);
		double result = 0.0; //�ʱ�ȭ �ϴ� ������ �޼ҵ� ���� ���������� ������ �ʱ�ȭ�ؾ� �ϱ� ����
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2; break;
		}
		return result;//�ڽ��� ȣ���� ������ ��(return ��)�� �����ִ� �ڵ�
	}
	
	//2. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ� �����ϱ�
	//���� 2��, ������, �����
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
	
	//3. ��ȯ���� ���� �Ű����� ���� �޼ҵ�
	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��: ");
		int su = sc.nextInt();//ScannerŬ������ nextInt �żҵ� ������
		System.out.print("��: ");
		int su2 =sc.nextInt();
		System.out.print("������: ");
		char op = sc.next().charAt(0);//ScannerŬ������ next �żҵ� �����ؼ� charAt �޼ҵ带 ������!
		double result = 0.0;
		switch (op) {
			case '+': result = su + su2; break;
			case '-': result = su - su2; break;
			case '*': result = su * su2; break;
			case '/': result = (double)su / su2; break;
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
			case '/': result = (double)su / su2; break;
		}
		return result;
	}
}
