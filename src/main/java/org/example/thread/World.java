package org.example.thread;

public class World extends  Thread{
    @Override
    public void run() {
        System.out.println("RUNNABLE");

        for (int i = 0; i <= 6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        World world = new World();
        System.out.println(world.getState());
        world.start();
        System.out.println(world.getState());
        world.sleep(200);
        System.out.println(world.getState());
        world.join();
        System.out.println(world.getState());
    }


}
