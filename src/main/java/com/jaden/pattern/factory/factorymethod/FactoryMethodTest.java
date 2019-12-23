package com.jaden.pattern.factory.factorymethod;

import com.jaden.pattern.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new GolangCourseFactory();
        course = factory.create();
        course.record();
    }
}
