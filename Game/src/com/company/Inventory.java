package com.company;

import java.util.ArrayList;

/**
 * Created by jr8800 on 2/11/2019.
 */
public class Inventory {
    private ArrayList in;
    private Items item;
    private int amount;

    public Inventory(){
        in = new ArrayList();
    }

    public void add(String items, String property){
        in.add(item = new Items(items, property));
    }

    public void use(){

    }


}
