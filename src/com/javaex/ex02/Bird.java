package com.javaex.ex02;

public abstract class Bird {

	// 필드
	private String name;

	// 생성자
	public Bird() {
	}

	public Bird(String name) {
		super();
		this.name = name;
	}

	// 메소드g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 일반메소드
	public String toString() {
		return "Bird [name=" + name + "]";
	}

	public abstract void sing();

	public abstract void fly();

	public abstract void showName();

}
