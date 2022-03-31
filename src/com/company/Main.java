package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int skaitlis = sc.nextInt();
        int fiveCount = 0;
        int reiz = 1;

        while(skaitlis != 0){
            int cipars = skaitlis % 10;
            if (cipars == 5) fiveCount++;
            reiz *= cipars;
            skaitlis /= 10;
        }
        System.out.println("5 satikas " + fiveCount + " reizes");
        System.out.println("Ciparu reizinājums = " + reiz);
    }
}
