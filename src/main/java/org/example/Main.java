package org.example;

public class Main {
    public static void main(String[] args) {
        Thread first = new Prioritizer.ThreadEstablisher("T1", Thread.MAX_PRIORITY);
        Thread second = new Prioritizer.ThreadEstablisher("T2",Thread.MAX_PRIORITY);
        Thread third = new Prioritizer.ThreadEstablisher("T3", Thread.MAX_PRIORITY);

        first.start();
        second.start();
        third.start();

        FirstQuest.generate().start();
    }
}