package com.person;

import java.util.Comparator;
//A class to define a new order for a list

public class SortByAge implements Comparator<Member> {
    @Override
    public int compare(Member p1, Member p2){
        return p1.getAge()-p2.getAge();
    }
}
