package chapter08.classPart;

class Product{
	static int count=0; //생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo; //인스턴스 고유 번호
	//스텝틱 영역에 없는 나중에 만들어지는 변수 int~~
	static int snum; //클래스 초기화, 정적변수
	int num=1; //명시적 초기화
	
	//클래스 초기화 출력
	static {
		snum=999;
		System.out.println("static: "+snum);
	}
	//인스턴스 초기화 출력
	{
		++count;
		serialNo=count;
	}
	//기본생성자
	public Product() {//기본생성자를 따라가면 num을 1씩 증가시키기대문에 2임
		num++; //이 시점에서 연산됨
	}
}

public class Construnctor4 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호:"+p1.serialNo);
		System.out.println("p2의 제품번호:"+p2.serialNo);
		System.out.println("p3의 제품번호:"+p3.serialNo);
		System.out.println("생산된 제품의 총수:"+Product.count+"개");
		//인스턴스 별로 초기화하기 때문에 값이 1에서 ++한 값으로 동일함
		System.out.println(p1.num);
		System.out.println(p2.num);
		System.out.println(p3.num);



	}

}
