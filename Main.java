package com.company;
import java.util.Scanner;

public class Main {
    // This is for 5 subjects only

    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

        System.out.println("Enter Total Number of Subject 1 Please Read CareFully");
        float submax1 = sc.nextFloat();
        System.out.println("Enter Your Subject 1 Number");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Total Number of Subject 2");
        float submax2 = sc.nextFloat();
        System.out.println("Enter Your Subject 2 Number");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Total Number of Subject 3");
        float submax3 = sc.nextFloat();
        System.out.println("Enter Your Subject 3 Number");
        float sub3 = sc.nextFloat();
        System.out.println("Enter Total Number of Subject 4");
        float submax4 = sc.nextFloat();
        System.out.println("Enter Your Subject 4 Number");
        float sub4 = sc.nextFloat();
        System.out.println("Enter Total Number of Subject 5");
        float submax5 = sc.nextFloat();
        System.out.println("Enter Your Subject 5 Number");
        float sub5 = sc.nextFloat();
        float totalNumber = submax1+submax2+submax3+submax4+submax5;
        float percentage = (sub1+sub2+sub3+sub4+sub5)/totalNumber*100;
        System.out.println(percentage + "%");

    }
}
