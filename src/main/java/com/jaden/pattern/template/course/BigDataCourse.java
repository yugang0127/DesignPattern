package com.jaden.pattern.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeWorkFlag = false;

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }

    void checkHomework() {
        System.out.println("检查大数据的作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeWorkFlag;
    }
}
