package com.example.demo.person;

// Student 클래스 정의
class Student {
	private int id; // id 필드

	public Student(int id) { // 생성자
		this.id = id;
	}

	public int getId() { // id를 반환하는 메서드
		return id;
	}
}

public class Two {

	public static void main(String[] args) {
		Student student = new Student(123); // Student 객체 생성
		System.out.println(student.getId()); // id 출력
	}
}
