package com.person;
//A java class to generate
//random number in any length
//for age and id;

import java.util.Random;

class RandomInteger {

    private int min;
    private int max;

    //A constructor to calculate min and max boundaries for nextInt() method
    RandomInteger(int size){
        min = 1;
        max = 9;
        for(int i = 1 ; i < size; i++){
            min = min *10;
            max = max *10 + 9;
        }
    }

    // A method to generate random number
    int   generateRandom() {
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }

}
