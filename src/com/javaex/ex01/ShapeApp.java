package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape s = new Ractangle("빨강"); // Shape은 인스턴스화 할 수 없다. Ractangle에 기본 생성자 만들어주기!
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);

		// sr1을 그리는 메소드 호출

		sr1.draw();

		// sr1의 가로크기 출력
		System.out.println("sr1의 가로는" + ((Ractangle) sr1).getWidth() + " 입니다.");

	}
}
