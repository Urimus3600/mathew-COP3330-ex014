/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */


package org.example;

import java.util.Scanner;

public class App
{
    public static double ceilMoney(double raw){
        return Math.ceil(raw*100)/100.0;
    }

    public static void main( String[] args )
    {
        final double tax = .055;
        double taxAmt;
        Scanner input = new Scanner(System.in);
        System.out.print( "What is the order amount? " );
        double amt = input.nextDouble();
        System.out.print("What is the state? ");
        String state = input.next();

        if(state.equals("WI")){
            taxAmt= amt * tax;
            System.out.printf("The subtotal is $%.2f.\n", amt);
            System.out.printf("The tax is $%.2f.\n", taxAmt);
            amt = ceilMoney(amt+taxAmt);
        }

        System.out.printf("The total is $%.2f.", amt);

    }
}
