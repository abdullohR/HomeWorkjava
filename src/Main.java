package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        Mahsulot obj1= new Mahsulot();
        obj1.setIshlabChiqaruvchi(cin.next());
        obj1.setIshlabChiqarVaqti(cin.next());
        obj1.setNomi(cin.next());
        obj1.setNarxi(cin.nextInt());
        obj1.setSaqlMudati(cin.nextInt());
        System.out.println(obj1.getIshlabChiqarVaqti());
    }
}