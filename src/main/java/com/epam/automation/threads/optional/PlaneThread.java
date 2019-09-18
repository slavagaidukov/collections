package com.epam.automation.threads.optional;

public class PlaneThread extends Thread{
    public void run () {
        System.out.println("The strip took the plane");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The plane began to enter the strip");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The plane took off");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The strip is free");


    }
}
