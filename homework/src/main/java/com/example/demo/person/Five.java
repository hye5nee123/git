package com.example.demo.person;

public class Five {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();        // 고양이 소리 출력
        cat.parentSound();  // 부모 클래스의 소리 출력
    }
}

// Animal 클래스 정의
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

// Cat 클래스 정의
class Cat extends Animal {
    void sound() {
        System.out.println("Meow"); // 고양이 소리
    }

    void parentSound() {
        super.sound(); // 부모 클래스의 sound 메서드 호출
    }
}
