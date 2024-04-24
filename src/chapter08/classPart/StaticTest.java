package chapter08.classPart;

class Student{
	public static int serialNum=1000; //클래스 변수, 정적변수
	//인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() { //명령어 실행=초기화 함
		serialNum++;
		studentID=serialNum;
	}
	
	public void getStudentInfo() {
		System.out.println(studentName+"의 학번: "+studentID);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Student.serialNum);
		
		Student StudentLee = new Student();
		StudentLee.studentName="이지원";
		StudentLee.getStudentInfo();
		
		Student StudentSon = new Student();
		StudentSon.studentName="손흥민";
		StudentSon.getStudentInfo();
	
	}

}
