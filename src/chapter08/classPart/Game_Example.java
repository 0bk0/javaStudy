package chapter08.classPart;

public class Game_Example {

	public static void main(String[] args) {
		Character cha1 = new Character("부평구망치","전사");
		System.out.println(cha1);
		cha1.skill();
		
		Character cha2 = new Character("가솔린","마법사",10,7,4,5);
		System.out.println(cha2);
		cha2.skill();


	}

}
