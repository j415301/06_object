package com.obj.controller;

public class InItBlockTest {
	
	public String name;
	public int age;
	public double height;
	public final String email;
	public static String data;
	
	//�ʱ�ȭ ��� ����ϱ�
	//��ü�� ������ ������ ����
	{
		//�ʵ�(�������)�� �ʱⰪ ����;
		//������ ����� ����
		//���� ���ϴ� �ʱ�ȭ ���� ������ ���� ��� ����
		System.out.println("�ʱ�ȭ ��� ����");//�޼ҵ� ȣ�⵵ ����
		name = "rclass������";
		age=19;
		height=180.5;
		email="prince0324@naver.com";
		//�ٵ� ����� �ʱ�ȭ ��Ϻ��� �� ������ �����ڸ� ���� ��..����
		
		//�Ϲ� �ʱ�ȭ��Ͽ��� static ������ �ʱ�ȭ�� �� ������?
		data = "�ʱ�ȭ �ǳ�?";
	}
	
	//������
	public InItBlockTest() {};
	
	//static �ʱ�ȭ ���: static���� ����� ������ �ʱ�ȭ�� �� ���
	//���� �� ���� ����
	static {
		System.out.println("static�ʱ�ȭ���");
		//name = "�����";//error, heap ������ �ִ� �����͸� static���� �����ؼ� ����
		//static �ʵ常 �ʱ�ȭ ����
		data= "�ڷγ� ��������";
		System.out.println(data);
	}

}
