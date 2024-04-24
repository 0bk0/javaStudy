package chapter08.classPart;

import java.time.LocalTime;

public class Time {
/*
 	*필드, 속성, 멤버변수의 초기화 순서
 	1.클래스 변수: 기본값-명시적 초기화-클래스 초기화 블록
 	2.인스턴스 변수: 기본값-명시적 초기화-인스턴스 초기화 블록-생성자 
 */
	static final int num = 999; //클래스 변수
	//나머지는 다 인스턴스 변수
	boolean am;
	int hour;
	int minute;
	int second;
	
	//클래스 초기화 블록
	static {
		System.out.println("static 초기화 블록");
	}
	//인스턴스 초기화 블록
	{
		System.out.println("instance 초기화 블록");
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		if (hour>=12) {
			hour-=12;
			am= false;
		}else {
			am= true;
		}
		minute=now.getMinute();
		second=now.getSecond();
	}
	//생성자 단축키:알트 쉬프트 s 누른다음에 o
	//명시적 생성자
	public Time(boolean am,int hour,int minute) {
		/*this
		-클래스 내부에서 해당 인스턴스를 부를 이름이 없음
		-인스턴스 이름이 각자 달라지기 때문에 this를 사용해서 자신을 가리킴
		*/
		this.am = am;
		this.hour = hour;
		this.minute = minute;
		//this.second = second;
	}
	public Time(boolean am,int hour,int minute,int second,String str) {
		//↓Time()이랑 똑같은데 안에서는 못하기때문에?대신 this를 쓰는 것
		this(am,hour,minute); //위쪽에서 다 되어지기 때문에 아래는 필요없음
		str = "초기값";
		/*this.am = am;
		this.hour = hour;
		this.minute = minute;
		this.second = second;*/
	}
	public Time(int hour, int minute) {
		this.am = hour<12;
		this.hour = hour%12;
		this.minute = minute;
		this.second=0;
	}
	void whatTime() {
		System.out.println(am?"오전":"오후");
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
	
	

	
}