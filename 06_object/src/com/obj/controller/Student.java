package com.obj.controller;

public class Student {
	
	public String name;
	public int age;
	public int grade;
	public int ban;
	public String addr;
	public double height;
	//���⿡ �ٷ� �Է��ؼ� �ʱ�ȭ �ϸ� "����� �ʱⰪ"
	
//	{
//		name = "������";
//		age = 26;
//		grade = 2;
//		ban = 6;
//		addr = "��⵵ ȭ����";
//		height = 165.5;
//	}
	
	
	//������ �߰��ϱ�
	//����������(���� public ���) Ŭ������(){ ���� (��κ� �ʵ� �ʱ�ȭ) }
	//�⺻ ������ -> default ������ �����Ǵ� ��
	public Student() {
		//�ʵ带 �ʱ�ȭ��
		//�켱������ ���� �����ڿ� ���� �ʱ�ȭ�� ���� ���������� �� ���� ��� �� �� �Ʒ� ������ ��µ�
		//�켱���� :JVM�⺻�� -> ����� �ʱⰪ -> ������ ���(�ڵ����� ����) -> ������ (���������� ����)
		name = "������";
		age = 27;
		grade = 1;
		ban = 10;
		addr = "��⵵ ��õ";
		height = 200.5;
		System.out.println("�⺻ ������ ����");
		
//		this("������",24,1,5,"��⵵ �Ȼ�",188.4);
	}//�⺻ �����ڴ� ������!!! �ڵ忡!!! �ۼ����ּ���!!!!
	
	//�Ű������� �ִ� ������
	//�ܺο���(�� ��ü�� �����ϴ� ��) �����͸� �޾Ƽ� �ʱ�ȭ�ϴ� ������
	public Student(String name, int age, int grade, int ban, String addr, double height) {
		//�ʵ� = �Ű�����(?) �� ���ų� ������� �ƴ�?
		this.name = name;//�Ű������� �ʵ���� �ߺ����� �� this ��� but ��������� �̸��� �Ȱ��� ���� ��
		this.age = age;
		this.grade = grade;
		this.ban = ban;
		this.addr = addr;
		this.height = height;
	}
	
	public Student(String name, int age, String addr, double height) {
		//�ٸ� ������ ȣ��
		//this();//default ������ ȣ��
		this(name, age, 10, 20, addr, height);
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
	}
	
	
	

}
