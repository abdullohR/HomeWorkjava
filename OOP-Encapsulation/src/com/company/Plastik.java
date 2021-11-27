package com.company;

public class Plastik {
    private static int hisob;
    Plastik(){
        hisob=5000;
    }

    public static void click(int perevod){
        if(perevod>0){
            hisob+=perevod;
        }
    }
}
