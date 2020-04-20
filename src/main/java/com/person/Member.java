package com.person;
// A class to keep a person's information
//name,age,id

class Member {
    private String firstName;
    private String lastName;
    private int age;
    private int id;
    private String email;

    //constructor with calling to RandomString and RandomInteger to generate random values for Member's fields;
    Member(int idSize, int ageSize) {
        this.firstName = new RandomString().generateRandomStringWithRegularExpression();
        this.lastName = new RandomString().generateRandomStringWithRegularExpression();
        this.age = new RandomInteger(ageSize).generateRandom();
        this.id = new RandomInteger(idSize).generateRandom();
        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"somemail.com";
    }

    //getter method to retrieve person's fields;
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getEmail(){return email;}
    int getId(){
        return id;
    }
    int getAge(){
        return age;
    }



}
