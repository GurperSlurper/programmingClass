package com.company;

/**
 * Created by jr8800 on 2/11/2019.
 */
public class Money {
    private int gold;
    private int silver;
    private int copper;

    public Money(){
        gold = 100;
        silver = 10;
        copper = 1;
    }

    public int gold(){
        return gold;
    }

    public int silver(){
        return silver;
    }

    public int copper(){
        return copper;
    }
}
