package com.obj.main;

import com.obj.controller.FunctionalTestP;

public class Run2P {
	
	public static void main(String[] args) {
		//1. ��ȯ���� �ְ� �Ű����� ���� �޼ҵ�
//		double result = new FunctionalTestP().cal1();
//		System.out.println(result);
		//System.out.println(new FunctionalTestP().cal1());
		
		//2. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ�
		FunctionalTestP fc = new FunctionalTestP();
//		fc.cal2(10, 20, '*');
		
		//3. ��ȯ���� ���� �Ű����� ���� �޼ҵ�
//		fc.cal3();
		
		//4. ��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ�
		double result = fc.cal4(5, 3, '/');
		System.out.println(result);
		System.out.println(fc.cal4(20,5,'/'));
	}
}
