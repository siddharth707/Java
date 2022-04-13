package com.company;

public class Main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);

                int n=51;

                String output=(n%2==0)?"even number":"odd number";
                System.out.println(output);

                int k=76;
                if(k%2==0){
                    System.out.println("even number");
                }else{
                    System.out.println("odd number");



                }
        }
    }}}


// write your code here


