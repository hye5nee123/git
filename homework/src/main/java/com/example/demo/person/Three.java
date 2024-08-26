package com.example.demo.person;

public class Three {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 3); // 가로 2, 세로 3인 Rectangle 객체 생성
		Circle cir = new Circle(2); // 반지름 2인 Circle 객체 생성

		double rectangleArea = rec.area(); // 직사각형 면적 계산
		double circleArea = cir.area(); // 원 면적 계산

		System.out.println("Rectangle Area: " + rectangleArea);
		System.out.println("Circle Area: " + circleArea);
	}
}

// Shape 클래스 정의
abstract class Shape {
	String color;

	public String getColor() {
		return color;
	}

	// 면적을 계산하는 추상 메서드
	abstract double area();
}

// Rectangle 클래스 정의
class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height; // 직사각형의 면적 계산
	}
}

// Circle 클래스 정의
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius; // 원의 면적 계산
	}
}
