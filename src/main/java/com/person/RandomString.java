package com.person;
//A java class to generate random strings both with Regex
//it has the capability to get the expression from the user
//in order to generate the desirable string

public class RandomString {

    private String regularExpression = "[a-zA-Z]{5,8}";


    // constructor
    RandomString() {
    }

    // constructor
    public RandomString(String sourceString, String regularExpression, String stringForMatch) {

        this.regularExpression = regularExpression;

    }


    //A method for generating a String with regular expression
    String generateRandomStringWithRegularExpression(){
     Xeger xegar = new Xeger(regularExpression);
        return xegar.generate();
    }

}
