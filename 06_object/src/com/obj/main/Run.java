package com.obj.main;

import com.obj.controller.Animal;
//import com.obj.controller.DefaultTest; //error: not visible. 접근 제한자에 의해 차단됨
//import com.obj.controller.Test;//error: cannot be resolved
import com.obj.controller.FieldTest;
import com.obj.controller.InItBlockTest;
import com.obj.controller.Student;

public class Run {
	
	public static void main(String[] args) {//main메소드
		
		new com.obj.controller.BasicObjTest();//BasicObjTest클래스를 이용하기 위해 BasicObjTest 객체 이용
		//클래스 앞에 모든 경로를 다 적어주면 import 안해도 사용 가능(import해도 써도 에러 안남)
		//하나하나 써주기 귀찮아서 import 써주는 것
		//new DefaultTest();//default 접근 제한자인 클래스는 다른 패키지에서 사용할 수 없다. -> 같은 패키지에서만 사용 가능
		
		//FieldTest클래스의 필드에 접근하기
		//1.클래스를 생성해야 함 -> new 연산자 사용
		//2. 생성된 클래스의 주소를 가지고 접근을 함 -> 접근연산자(.)사용
		FieldTest fieldTest = new FieldTest();
		//생성된 객체의 필드 접근하기 (직접접근)
		System.out.println(fieldTest.name);//null(자동초기화됨) //접근제한자가 public-> 직접접근 가능
		//System.out.println(fieldTest.age); //error: 접근제한자가 default
		//System.out.println(fieldTest.email);//error: 접근제한자가 private
		
		//필드에 값 넣기
		fieldTest.name = "제인혁";
		System.out.println(fieldTest.name);//제인혁
		
		
		
		
		//static 변수에 접근하기
		FieldTest.nickName = "박명수";
		//FieldTest.height = 180.5;//error, 접근제한자가 private
		
		//FieldTest.Name = "김상현";//error, static 필드가 아닌 곳에서는 new를 통해 접근해야 함
		new FieldTest().name = "김상현";
		
		System.out.println();
		
		
		
		
		//초기화 블럭 이해하기
		InItBlockTest ib = new InItBlockTest();
		System.out.println("이름: "+ib.name+" 나이: "+ib.age+" 키: "+ib.height);
//		//초기화블럭을 사용하기 전에는 값이 입력되어 있지 않기 때문에 각 자료형에 맞는 default값이 출력됨
		InItBlockTest ib2 = new InItBlockTest();
		System.out.println("이름: "+ib2.name+" 나이: "+ib2.age+" 키: "+ib2.height);
		//초기화 블럭은 객체를 생성할 때마다 실행되고 static 초기화 블럭은 최초 한 번만 실행됨
		
		
		System.out.println();
		
		
		
		//Student클래스를 만들어보자.
		//모든 필드는 전체에서 접근할 수 있게 설정
		//이름, 나이, 학년, 반, 주소, 키
		//객체의 필드를 출력해보자
		//출력했을 때 본인의 정보가 출력될 수 있게 설정하세요
		Student s = new Student();
		System.out.println(s.name+s.age+s.grade+s.ban+s.addr+s.height);
		System.out.println("s: "+s);
		Student s1 = new Student();
		System.out.println(s1.name+s1.age+s1.grade+s1.ban+s1.addr+s1.height);
		System.out.println("s1: "+s1);
		
		
		
		
		//매개변수 있는 생성자를 이용
		//생성 시부터 원하는 데이터를 객체에 대입할 수 있음
		Student s2 = new Student("정유정",20,2,11,"산본",180.7);
		System.out.println(s2.name+s2.age+s2.grade+s2.ban+s2.addr+s2.height);
		
		Student s3 = new Student("김예진",26,"서울",190.5);
		System.out.println(s3.name+s3.age+s3.grade+s3.ban+s3.addr+s3.height);
		//grade, ban은 매개변수 생성자에서 초기화되지 않았기 때문에 default값이 실행됨. 그리고 this()연산자를 이용해서 같은 클래스의 다른 생성자를 불러왔기 때문에 10, 20이 입력되어 출력됨
		//매개변수 생성자는 매개변수들이 같은 1개만 실행됨
		
		
		//Animal 클래스 만들어서 출력하기 
		//종류, 이름, 나이, 서식지, 다리수, 성별
		//개, 바둑이, 9, 동네 골목, 4, 남 출력
		Animal a = new Animal("개", "바둑이", 9, "동네 골목", 4, '남');
		System.out.println(a.species+a.name+a.age+a.live+a.leg+a.gender);
		//원숭이, 원순이, 10, 일본, 2, 여 출력
		Animal a2 = new Animal("원숭이", "원순이", 10, "일본", 2, '여');
		System.out.println(a2.species+a2.name+a2.age+a2.live+a2.leg+a2.gender);
		//코끼리, 코돌이, 77, 냉장고, 4, 여 출력
		Animal a3 = new Animal("코끼리", "코돌이", 77, "냉장고", 4, '여');
		System.out.println(a3.species+a3.name+a3.age+a3.live+a3.leg+a3.gender);
		
		//만약 클래스에 매개변수 있는 생성자를 만들고 default 생성자를 만들지 않으면?
		//error남 why? 매개변수가 있는 클래스에는 JVM이 기본 생성자를 만들어주지 않음
		
	}

}
