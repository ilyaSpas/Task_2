package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newNumbers = foo(numbers, new MyFilter);
    }

    private static int[] foo(int[] numbers, MyFilter myFilter) {
    }
}