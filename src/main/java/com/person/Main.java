package com.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Main class to create a list of Member class

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfPeople;
        //validation on integer input
        do {
            System.out.print("How many people do you want to have in your list ? ");
            while (!input.hasNextInt()) {
                System.out.print("That's not a valid number! Please enter a positive number.. ");
                input.next();
            }
            numberOfPeople = input.nextInt();
        }while(numberOfPeople <= 0);


       List<Member> listOfPeople = new ArrayList<>();
        for(int i =0 ; i<numberOfPeople ; i++) {
            listOfPeople.add(new Member(8,2));
        }


        printList(listOfPeople,"list before sorting");
        listOfPeople.sort(new SortByAge());
        printList(listOfPeople,"list after sorting by people's age");


        System.out.print("Give me a name ? ");
        while (!input.hasNext("[a-z]{1,10}")) {
                System.out.print("That's not a valid name! Please enter a name in lowercase format.. ");
                input.next();
            }
        String nameForSearch = input.next();
        System.out.println(nameForSearch +((fine(listOfPeople,nameForSearch))? " is " :" is not ") +" in the list" );

        groupByAge(listOfPeople);
    }

    private static void groupByAge(List<Member> listOfPeople) {
        List<Member> listYoungerThan20 = new ArrayList<>();
        List<Member> listBetween20To40 = new ArrayList<>();
        List<Member> listBetween40To70 = new ArrayList<>();
        List<Member> listOlderThan70 = new ArrayList<>();

        int age ;
        for(Member member : listOfPeople){
            age = member.getAge();
            if(age<= 20)
               listYoungerThan20.add(member);

            if(age > 20 && age<= 40)
                listBetween20To40.add(member);
            if(age > 40 && age<= 70)
                listBetween40To70.add(member);
            if(age > 70)
                listOlderThan70.add(member);

        }
        printList(listYoungerThan20,"This is a list of people younger than 20 :");
        printList(listBetween20To40,"This is a list of people between 20 to 40 :");
        printList(listBetween40To70,"This is a list of people between 40 to 70 :");
        printList(listOlderThan70,"This is a list of people older than 70 :");



    }

    private static boolean fine(List<Member> listOfPeople, String nameForSearch) {
        boolean result = false;
        for(Member member :listOfPeople){
            if(member.getFirstName().equals(nameForSearch))
                result = true;

        }
        return result;
    }

    private static void printList(List<Member> listOfPeople, String message){

        System.out.println("\n" +message+"\n");
        System.out.printf("%-20s %-20s %-20s %-20S %-20s \n", "First Name","Last Name","ID", " Age","Email");
        for(Member member : listOfPeople)
            System.out.printf("%-20s %-20s %-20d %-10d %-50s\n", member.getFirstName(),member.getLastName(), member.getId(), member.getAge(),member.getEmail());
           // System.out.println("name :" +person.getName() +" " +"ID :" +person.getId()+" "+"Age :" + person.getAge());
    }

}
