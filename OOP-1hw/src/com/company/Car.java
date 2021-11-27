package com.company;

public class Car {
    private String color,brandName,company,clas;
    private int price;
    Car(){
     company="Orient motors";
    }
    Car(String brandName){
        this.brandName="Mercedes";
    }
    Car(int price){
        this.price=220000;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}