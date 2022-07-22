package com.iu.s1;

public class S1Main {

	public static void main(String[] args) {
		//프로그램 생각 (생각을 하고 넘어가야 어떤것 부터 해야할지 안다)
		//현실 -> digital
		//음식 주문
		//Java(는 Object언어이다 가상의 객체를 만듬)
		//Data, Function (데이터, 기능을 다룸)
		//이력서 : 이름, 전화번호, 나이, 주소
		//이력서를 복사해서 쓴다 -> 자바에서는 객체를 만든다
		Resume resume = new Resume(); //이력서 양식을 만듬
		Resume resume2 = new Resume();
		resume.name = "";
		resume2.name = "";
		
		Check check = new Check(); //체크해주는 사람을 만듬
		check.resumeCut(resume2);
		check.resumeCut(resume);
		
	}

}
