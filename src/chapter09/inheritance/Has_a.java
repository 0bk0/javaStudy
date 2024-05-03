package chapter09.inheritance;

class Human5 {
	Tool tool; // 멤버 변수==데이터 타입이 Tool

	Human5(String toolName) {
		tool = new Tool(toolName);
	}

	void use() {
		System.out.println(tool.name + "을/를 사용하다");
	}
}

class Tool {
	String name;

	Tool(String name) {
		this.name = name;
	}
}

public class Has_a {

	public static void main(String[] args) {
		/*
		 * has a relation 포함, 구성 관계
		 */
		Human5 h = new Human5("파이어스틸");
		System.out.println(h.tool.name);
		h.use();

	}

}
