package com.jaden.pattern.factory.factorymethod;

import com.jaden.pattern.factory.GolangCourse;
import com.jaden.pattern.factory.ICourse;
import com.jaden.pattern.factory.JavaCourse;

public class GolangCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new GolangCourse();
    }
}
