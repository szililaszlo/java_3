package com.company;

import java.util.Scanner;

/**
 * Created by java1 on 2017.12.06..
 */
public class UserRegistry {
    private User[] users;

    public UserRegistry() {
        users = new User[10];
        init();
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        int operation = -1;

        while (operation != 5) {
            System.out.println("Válasszon egy menüpontot: ");
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    printAllUser();
                    break;
                case 2:
                    ;
                    addNewUser();
                    break;
                case 3:
                    modifyUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    System.out.println("Kilépés....");
                default:
                    printMenu();
            }

        }
    }


    public void printMenu() {
        System.out.println("********Menu********");
        System.out.println("*Print all User (1)*");
        System.out.println("**Add new User (2)**");
        System.out.println("**Modify User (3)***");
        System.out.println("**Delete User (4)***");
        System.out.println("******EXIT (5)******");
    }

    private void init() {
        for (int i = 0; i < users.length - 1; i++) {
            users[i] = new User();
            users[i].setId(i);
            users[i].setFirstName("alma" + Math.random());
            users[i].setLastname("béla" + Math.random());
            users[i].setPassword("secretkey" + Math.random());
            users[i].setAge((int) (Math.random() * 100));
        }
    }

    private void printAllUser() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.print("id:" + users[i].getId());
                System.out.print("  \tfirstname: " + users[i].getFirstname());
                System.out.print(" \t,lastname: " + users[i].getLastname());
                System.out.print(" \t,password: " + users[i].getPassword());
                System.out.println(" \t,age: " + users[i].getAge());
            }
        }
    }

    private void addNewUser() {
        boolean hasEmptyPlace = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("firstname: ");
                String firstName = scanner.nextLine();
                System.out.println("lastname: ");
                String lastname = scanner.nextLine();
                System.out.println("password: ");
                String password = scanner.nextLine();
                System.out.println("age: ");
                int age = scanner.nextInt();

                users[i] = new User();
                users[i].setId(i);
                users[i].setFirstName(firstName);
                users[i].setLastname(lastname);
                users[i].setPassword(password);
                users[i].setAge(age);

                hasEmptyPlace = true;
                break;
            }
        }
        if (!hasEmptyPlace) {
            System.out.println("Nincs több hely a tömbben!");
        }
    }

    private void modifyUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an ID: ");
        int inputid = scanner.nextInt();

        for (int i = 0; i < users.length; i++) {

            if (users[i] != null && users[i].getId() == inputid) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("firstname: ");
                String firstName = scanner1.nextLine();
                System.out.println("lastname: ");
                String lastname = scanner1.nextLine();
                System.out.println("password: ");
                String password = scanner1.nextLine();
                System.out.println("age: ");
                int age = scanner.nextInt();


                users[i].setFirstName(firstName);
                users[i].setLastname(lastname);
                users[i].setPassword(password);
                users[i].setAge(age);

                break;
            }
        }

    }

    private void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an ID: ");
        int inputid = scanner.nextInt();

        for (int i = 0; i < users.length; i++) {

            if (users[i] != null && users[i].getId() == inputid) {
                users[i] = null;
                break;
            }
        }

    }
}
