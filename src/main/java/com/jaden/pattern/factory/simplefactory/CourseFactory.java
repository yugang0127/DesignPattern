package com.jaden.pattern.factory.simplefactory;

import com.jaden.pattern.factory.GolangCourse;
import com.jaden.pattern.factory.ICourse;
import com.jaden.pattern.factory.JavaCourse;

public class CourseFactory {
//    public ICourse create(String courseName) {
//
//        if (courseName.equals("Java")) {
//            return new JavaCourse();
//
//        } else if (courseName.equals("Golang")) {
//            return new GolangCourse();
//        }
//        return null;
//    }

//    public ICourse create(String className) {
//
//        try {
//            if (null != className && !className.equals("")) {
//                return (ICourse)Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();;
//        }
//
//        return null;
//    }
    public ICourse create(Class<? extends ICourse> clazz) {

        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }

    return null;
}
}
