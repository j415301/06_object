package com.obj.main;

import com.obj.controller.FunctionalTest;

public class Run2 {
	
	public static void main(String[] args) {
		
		//1. ��ȯ���� �ְ� �Ű����� ���� �޼ҵ�
//		double result = new FunctionalTest().cal1();//�����Ŭ������ �̷��� ��ü�� �����.
//							 						//���~~ �� ��� ��ü�� ���� ����ؾ� ��
//		System.out.println(result);
//		System.out.println(new FunctionalTest().cal1());
		
		//2. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
		//�Ű����� �ִ� ������ ȣ��
		FunctionalTest ft = new FunctionalTest();
//		ft.cal2(20, 20, '*');
		//double result = ft.cal2(10, 20, '*');//error:��ȯ���� ���� ����
		//System.out.println(ft.cal2(10, 20, '*');//void�� ������ ��ȯ���� ����(2���� �ٽ� ���)
		//ft.cal2(10, 20);//error //�Ű������� �ִ� �޼ҵ带 ȣ���� ���� �ݵ�� ����� �Ű��������� ��� �����ؾ���(�Ű������� �ڷ����� ������ �� ������� ��)
//		double result = new FunctionalTest().cal1()+300;//cal1�� ��ȯ���� �ִ� �޼ҵ��̹Ƿ� ����
		
		//3. ��ȯ���� ���� �Ű����� ���� �޼ҵ�
//		ft.cal3();
		
		//4. ��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ�
		double result = ft.cal4(20, 30, '*');
		System.out.println("��� ���: "+result);
		System.out.println("�����̰� ����� ��� : "+ft.cal4(20, 20, '+'));
	}

}
