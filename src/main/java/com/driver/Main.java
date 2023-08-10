package com.driver;

public class Main {
    public static void main(String[] args){

        RWOnly obj = new RWOnly();
//        obj.name = "Pratham"; // name has a private access so we dont set the name and also dont access the name
//        System.out.println(obj.name);
        obj.setName("Pratham");
        System.out.println(obj.getName());// by using setter and getter we can set and get the name
    }
}