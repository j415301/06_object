package com.obj.controller;

public class BasicObjTest {//Ŭ���� �����
//public: ���� ������
//class Ŭ���� ����
//BasicObjTest: Ŭ������
	
	//1. �ʵ�(�������): ������ ���� (���� ����)
	//2. ������: Ŭ������ �ν��Ͻ�ȭ ��ų �� �����ϴ� ��, ��ü�� ������ �� ��� (���� �Ұ� -> �������� �� jvm�� ������ �� �� �ڵ����� ����)
	//3. �޼ҵ�: ��� (���� ����)
	
	DefaultTest d=new DefaultTest();
	//default ���� �����ڸ� ����� Ŭ������ ���� ��Ű�������� ����� �� �ִ� Ŭ������
	
	public void fieldTest() {
		FieldTest fieldTest = new FieldTest();//run Ŭ������ �ִ� fieldTest ��ü�� �ּҿ� �ٸ�
		//�ڷ��� FieldTest(Ŭ����), ������ fieldTest
		//new�� ���� ��ü ���� �� heap�� ������ ��������� �����, FieldTest()�� ������ �ּҸ� ������ ������ ������ (��ȣ�� �ּҸ� �ҷ���)
		System.out.println(fieldTest.name);
		System.out.println(fieldTest.age);//default ����������: ���� ��Ű���� �ִ� ���̹Ƿ� ���� ����
		//System.out.println(fieldTest.email);//error: not visible -> ����������(private)�� ���� ���ܵ�
		
		
	}
	

}
