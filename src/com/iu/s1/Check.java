package com.iu.s1;

public class Check {
	
	//인공지능
	//이력서 커트
	public boolean resumeCut(Resume resume) {
		if(resume.age>40) {
			//resume.check=false;
			return false; //타입이 boolean 이기 때문에 리턴타입도 boolean이다
		}else {
			//resume.check=true;
			return true;
		}
	}
	
	
}
