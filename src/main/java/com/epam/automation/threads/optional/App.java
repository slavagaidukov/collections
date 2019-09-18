package com.epam.automation.threads.optional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        PlaneThread plane1 = new PlaneThread();
        PlaneThread plane2 = new PlaneThread();
        PlaneThread plane3 = new PlaneThread();
        PlaneThread plane4 = new PlaneThread();
        PlaneThread plane5 = new PlaneThread();
        PlaneThread plane6 = new PlaneThread();
        PlaneThread plane7 = new PlaneThread();
        PlaneThread plane8 = new PlaneThread();
        PlaneThread plane9 = new PlaneThread();
        PlaneThread plane10 = new PlaneThread();
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.execute(plane1);
        service.execute(plane2);
        service.execute(plane3);
        service.execute(plane4);
        service.execute(plane5);
        service.execute(plane6);
        service.execute(plane7);
        service.execute(plane8);
        service.execute(plane9);
        service.execute(plane10);
        service.shutdown();


    }
}
