package com.mycompany.app.practice;

import com.sun.tracing.dtrace.DependencyClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void startCar(){
        System.out.println("Car stared");
    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car is Driving");
    }
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car is Stopped");
        //Assert.fail();
    }
    @Test(dependsOnMethods = {"stopCar", "driveCar"})
    void parkCar(){
        System.out.println("Car is parked");
    }
}
