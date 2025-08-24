package org.cfs;

public class Car {
    private Engine engine;

//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    public Car(Engine engine) {
        System.out.println("car constructor called");
        this.engine = engine;
    }

    void drive(){
        int values=engine.start();
        if(values>=1){
            System.out.println("Engine started");
        }
        else System.out.println("Engine failed to start");
    }
}
