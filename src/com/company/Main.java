package com.company;

public class Main {

    public static void main(String[] args) {

        int[] temperatures = new int[5];

        for (int i = 0; i < 5; i++) {
            temperatures[i] = i;
        }

        // populateArray(temperatures);
        // printArrayElements(temperatures);
        // printMaxValue(temperatures);

        countAVG(temperatures);

        UserOperation userOperation = new UserOperation();

        userOperation.printUserArray(userOperation.generateUserArray(10));


      /*  User testUser = userOperation.createRandomUser();

        System.out.println(testUser.getFirstname());
        System.out.println(testUser.getLastname());
        System.out.println(testUser.getPassword());
        System.out.println(testUser.getAge());
      */


    }

    /*
    private static void printArrayElements(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

    }

    private static void populateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static void printMaxValue(int[] arr) {
        int max = arr[0];
        int second_max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                second_max =max;
                max = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(second_max);
    }
    */

    private static void  countAVG(int[] array) {
        double summ =0;
        for (int i= 0; i< array.length; i++)
        {
            summ=summ+array[i];
        }
        double result = summ/array.length;
        System.out.println("---------------");
        System.out.println("AVG: " + result);
    }
}
