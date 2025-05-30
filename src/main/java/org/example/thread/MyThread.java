package org.example.thread;

import org.example.Counter;

public class MyThread extends  Thread {

    private Counter counter;

    public MyThread (Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            counter.increment();
        }
    }
}
