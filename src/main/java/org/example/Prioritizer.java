package org.example;

public  class Prioritizer {

    static class ThreadEstablisher extends Thread{
        public ThreadEstablisher(String name, int priority) {
            super(name);
            setPriority(priority);
        }

        @Override
        public void run(){
            System.out.println(getName() + " started");
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName() + " is finished");
        }
    }
}
