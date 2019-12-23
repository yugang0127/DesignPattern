package com.jaden.pattern.factory.abstractfactory;

public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
