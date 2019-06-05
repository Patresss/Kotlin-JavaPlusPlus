package com.patres.kotlinplusplus.f_delegate.java;

import static java.lang.Thread.sleep;

public class DelegateApp {

    private  Integer price = null;


    private  int calculatePrice() throws InterruptedException {
        if (price == null) {
            sleep(1000);
            price = 10000;
        }
        return price;
    }

    public  void setPrice(Integer price) {
        System.out.println("Old: " + this.price + "| new: " + price);
        this.price = price;
    }
}
