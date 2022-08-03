package com.example.Springq2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        String source = vehicle.getSource();
        System.out.println("Source" +vehicle.getSource());
        System.out.println("Destination" + vehicle.getDestinationMap());
        System.out.println("Enter destination");
        String destination =scanner.next();
        Map<String, Double> destinationMap = vehicle.getDestinationMap();
        double cost = destinationMap.get(destination);
        System.out.println("Cost from "+source +"to"+ destination+"is"+ cost);
}
}