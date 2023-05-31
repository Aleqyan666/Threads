package org.example;

public class FirstQuest extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static FirstQuest generate(){
        return new FirstQuest();
    }
}
