package com.javaex.ex01;

public abstract class Shape {

	// 필드
	protected String fillColor;

	// 생성자

	public Shape(String fillColor) {
		this.fillColor = fillColor;
	}

	// 일반메소드
	public abstract void draw();
}
