package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jr8800 on 2/11/2019.
 */
public class Items {
    //arraylist name property
    ArrayList<String> item = new ArrayList<String>();
    ArrayList<String> property = new ArrayList<String>();

    public Items(String item, String property){
        this.item.add(item);
        this.property.add(property);
    }

    public ArrayList<String> getItem() {
        return item;
    }

    public ArrayList<String> getProperty() {
        return property;
    }
}
