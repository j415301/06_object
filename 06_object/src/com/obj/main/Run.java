package com.obj.main;

import com.obj.controller.Animal;
//import com.obj.controller.DefaultTest; //error: not visible. ���� �����ڿ� ���� ���ܵ�
//import com.obj.controller.Test;//error: cannot be resolved
import com.obj.controller.FieldTest;
import com.obj.controller.InItBlockTest;
import com.obj.controller.Student;

public class Run {
	
	public static void main(String[] args) {//main�޼ҵ�
		
		new com.obj.controller.BasicObjTest();//BasicObjTestŬ������ �̿��ϱ� ���� BasicObjTest ��ü �̿�
		//Ŭ���� �տ� ��� ��θ� �� �����ָ� import ���ص� ��� ����(import�ص� �ᵵ ���� �ȳ�)
		//�ϳ��ϳ� ���ֱ� �����Ƽ� import ���ִ� ��
		//new DefaultTest();//default ���� �������� Ŭ������ �ٸ� ��Ű������ ����� �� ����. -> ���� ��Ű�������� ��� ����
		
		//FieldTestŬ������ �ʵ忡 �����ϱ�
		//1.Ŭ������ �����ؾ� �� -> new ������ ���
		//2. ������ Ŭ������ �ּҸ� ������ ������ �� -> ���ٿ�����(.)���
		FieldTest fieldTest = new FieldTest();
		//������ ��ü�� �ʵ� �����ϱ� (��������)
		System.out.println(fieldTest.name);//null(�ڵ��ʱ�ȭ��) //���������ڰ� public-> �������� ����
		//System.out.println(fieldTest.age); //error: ���������ڰ� default
		//System.out.println(fieldTest.email);//error: ���������ڰ� private
		
		//�ʵ忡 �� �ֱ�
		fieldTest.name = "������";
		System.out.println(fieldTest.name);//������
		
		
		
		
		//static ������ �����ϱ�
		FieldTest.nickName = "�ڸ��";
		//FieldTest.height = 180.5;//error, ���������ڰ� private
		
		//FieldTest.Name = "�����";//error, static �ʵ尡 �ƴ� �������� new�� ���� �����ؾ� ��
		new FieldTest().name = "�����";
		
		System.out.println();
		
		
		
		
		//�ʱ�ȭ �� �����ϱ�
		InItBlockTest ib = new InItBlockTest();
		System.out.println("�̸�: "+ib.name+" ����: "+ib.age+" Ű: "+ib.height);
//		//�ʱ�ȭ���� ����ϱ� ������ ���� �ԷµǾ� ���� �ʱ� ������ �� �ڷ����� �´� default���� ��µ�
		InItBlockTest ib2 = new InItBlockTest();
		System.out.println("�̸�: "+ib2.name+" ����: "+ib2.age+" Ű: "+ib2.height);
		//�ʱ�ȭ ���� ��ü�� ������ ������ ����ǰ� static �ʱ�ȭ ���� ���� �� ���� �����
		
		
		System.out.println();
		
		
		
		//StudentŬ������ ������.
		//��� �ʵ�� ��ü���� ������ �� �ְ� ����
		//�̸�, ����, �г�, ��, �ּ�, Ű
		//��ü�� �ʵ带 ����غ���
		//������� �� ������ ������ ��µ� �� �ְ� �����ϼ���
		Student s = new Student();
		System.out.println(s.name+s.age+s.grade+s.ban+s.addr+s.height);
		System.out.println("s: "+s);
		Student s1 = new Student();
		System.out.println(s1.name+s1.age+s1.grade+s1.ban+s1.addr+s1.height);
		System.out.println("s1: "+s1);
		
		
		
		
		//�Ű����� �ִ� �����ڸ� �̿�
		//���� �ú��� ���ϴ� �����͸� ��ü�� ������ �� ����
		Student s2 = new Student("������",20,2,11,"�꺻",180.7);
		System.out.println(s2.name+s2.age+s2.grade+s2.ban+s2.addr+s2.height);
		
		Student s3 = new Student("�迹��",26,"����",190.5);
		System.out.println(s3.name+s3.age+s3.grade+s3.ban+s3.addr+s3.height);
		//grade, ban�� �Ű����� �����ڿ��� �ʱ�ȭ���� �ʾұ� ������ default���� �����. �׸��� this()�����ڸ� �̿��ؼ� ���� Ŭ������ �ٸ� �����ڸ� �ҷ��Ա� ������ 10, 20�� �ԷµǾ� ��µ�
		//�Ű����� �����ڴ� �Ű��������� ���� 1���� �����
		
		
		//Animal Ŭ���� ���� ����ϱ� 
		//����, �̸�, ����, ������, �ٸ���, ����
		//��, �ٵ���, 9, ���� ���, 4, �� ���
		Animal a = new Animal("��", "�ٵ���", 9, "���� ���", 4, '��');
		System.out.println(a.species+a.name+a.age+a.live+a.leg+a.gender);
		//������, ������, 10, �Ϻ�, 2, �� ���
		Animal a2 = new Animal("������", "������", 10, "�Ϻ�", 2, '��');
		System.out.println(a2.species+a2.name+a2.age+a2.live+a2.leg+a2.gender);
		//�ڳ���, �ڵ���, 77, �����, 4, �� ���
		Animal a3 = new Animal("�ڳ���", "�ڵ���", 77, "�����", 4, '��');
		System.out.println(a3.species+a3.name+a3.age+a3.live+a3.leg+a3.gender);
		
		//���� Ŭ������ �Ű����� �ִ� �����ڸ� ����� default �����ڸ� ������ ������?
		//error�� why? �Ű������� �ִ� Ŭ�������� JVM�� �⺻ �����ڸ� ��������� ����
		
	}

}
