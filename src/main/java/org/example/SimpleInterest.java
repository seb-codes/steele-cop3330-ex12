package org.example;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        Integer principle = scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        Double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        Integer years = scan.nextInt();

        double rate_percent = rate / 100.0;

        double end_amount = principle*(1+(rate_percent*years));

        System.out.println(String.format("After %d years at %.02f%%, the investment will be worth $%.02f.",years,rate,end_amount));
    }
}
