package com.jaden.pattern.factory.abstractfactory;

public class GolangCourseFactory implements CourseFactory {
    public INote createNote() {
        return new GolangNote();
    }

    public IVideo createVideo() {
        return new GolangVideo();
    }
}
