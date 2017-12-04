package com.company;

/**
 * Created by java1 on 2017.12.04..
 */
public class UserOperation {

    public User createRandomUser() {
        User user = new User();

        user.setFirstName("alma" + Math.random());
        user.setLastname("béla" + Math.random());
        user.setPassword("secretkey" + Math.random());
        user.setAge((int) (Math.random() * 100));

        return user;
    }

    public User[] generateUserArray(int n) {
        User[] users = new User[n];
        for (int i =0; i<n; i++) {
           users[i] = createRandomUser();
        }
        return users;
    }

    public void printUserArray(User[] users) {
        for (int i  = 0; i<users.length; i++) {
            System.out.println(users[i].getFirstname());
            System.out.println(users[i].getLastname());
            System.out.println(users[i].getPassword());
            System.out.println(users[i].getAge());
        }
    }



}
