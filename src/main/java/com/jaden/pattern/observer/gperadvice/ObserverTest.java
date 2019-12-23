package com.jaden.pattern.observer.gperadvice;

public class ObserverTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher jaden = new Teacher("Jaden");
        Teacher tom = new Teacher("tom");

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.addObserver(jaden);
        gper.addObserver(tom);
        gper.publishQuestion(question);
    }
}
