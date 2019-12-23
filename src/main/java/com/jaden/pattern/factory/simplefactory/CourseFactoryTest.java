package com.jaden.pattern.factory.simplefactory;

import com.jaden.pattern.factory.ICourse;
import com.jaden.pattern.factory.JavaCourse;

public class CourseFactoryTest {
    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.record();
        CourseFactory factory = new CourseFactory();
//        ICourse course = factory.create("Java");
//        ICourse course = factory.create("com.jaden.pattern.factory.JavaCourse");
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }
}
