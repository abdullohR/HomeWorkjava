package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        Car obj1= new Car();
        obj1.setClas("Mercedes SLS-AMG");
        System.out.println(obj1.getClas());
    }
}