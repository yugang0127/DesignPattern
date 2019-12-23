package com.jaden.pattern.factory.abstractfactory;

public class CourseFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();

        factory = new GolangCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
