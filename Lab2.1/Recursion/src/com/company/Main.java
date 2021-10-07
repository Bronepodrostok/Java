package com.company;

public class Main {
    public static void task2(int n) {
        if (n > 1) task2(n - 1);
        System.out.print(n + " ");
    }

    public static void task3(int A, int B) {
        if (A > B) {
            task3(A-1, B);
        }
        if (A < B) {
            task3(A+1, B);
        }
        System.out.print(A + " ");
    }

    public static void task15(int n) {
        System.out.print(n % 10 + " ");
        if (n > 9) task15(n / 10);
    }

    public static void main(String[] args) {
        task2(5);
        System.out.println();
        task3(10, 15);
        System.out.println();
        task15(12);
    }
}
