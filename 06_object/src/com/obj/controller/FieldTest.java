package com.obj.controller;

public class FieldTest {
	//�ʵ� �����ϱ�
	//���� ������(public, protected, (default), private) �ڷ��� ������
	
	public String name;
	int age;
	private String email;
	
	public void test() {//void: method ����
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);//���⿡���� ���� ����
	}
	
	//static �ʵ�(�������) �����ϱ�
		public static String nickName;
		private static double height;
		
		//final ����� ���! �� ���� �Է¹ް� ����
		//public final char ch=;//error
		//final���� �ʱ�ȭ������ ������ �ٷ� default ���� ���� fix�ǹ��� -> ����� ����� �ǹ̰� ����
		
		//but ���� �� �ٷ� �ʱ�ȭ���� �ʰ� ���߿� �� �� �ִ� ����� ����
		//�ʵ�(�������) �ʱ�ȭ ���, �����ڸ� �̿��ؼ� �ʱ�ȭ�� �� ����
		public final char ch;
		{
			ch='C';
		}
		//{}: �ʱ�ȭ���, �ʱ�ȭ ��� �ȿ��� �ʱ�ȭ�ߴ��� ������ ����

}
