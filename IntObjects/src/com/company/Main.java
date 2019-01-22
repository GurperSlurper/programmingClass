package com.company;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Random myRandom = new Random();
	    Random anotherRandomGenerator = new Random();

	    int randInt = myRandom.nextInt();
        System.out.println(randInt);

        double randDouble = anotherRandomGenerator.nextDouble();
        System.out.println(randDouble);

        int randInt2 = myRandom.nextInt();
        System.out.println(randInt2);

        double randDouble2 = anotherRandomGenerator.nextDouble();
        System.out.println(randDouble2);

        ArrayList<Integer>  myList = new ArrayList<>();

        myList.add(12);
        System.out.println(myList.size());
        myList.add(14);
        System.out.println(myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        myList.set(0, 5);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        myList.clear();
        System.out.println(myList.size());

        Date currentDate = new Date();
        Date anotherDate = new Date();

        String curDateString = currentDate.toString();
        System.out.println(curDateString);
        anotherDate.setTime(12478);
        if (currentDate.before(anotherDate)){
            System.out.println("current date is before another date");
        }
        else if(!currentDate.before(anotherDate)){
            System.out.println("current date is after another date");
        }
    }
}
