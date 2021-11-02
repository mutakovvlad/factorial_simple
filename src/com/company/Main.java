package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String args[]) {
        System.out.println("Введите значение для вычисления факториала");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}