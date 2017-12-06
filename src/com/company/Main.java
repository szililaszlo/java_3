package com.company;

public class Main {

    public static void main(String[] args) {

        UserOperation userOperation = new UserOperation();

        //userOperation.printUserArray(userOperation.generateUserArray(10));


      /*  User testUser = userOperation.createRandomUser();

        System.out.println(testUser.getFirstname());
        System.out.println(testUser.getLastname());
        System.out.println(testUser.getPassword());
        System.out.println(testUser.getAge());
      */

        UserRegistry userRegistry = new UserRegistry();
        //userRegistry.printMenu();
        userRegistry.run();


    }

}
