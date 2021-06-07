/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 21 - Numbers to Names

package org.example;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
    //Prompt user for number
        Scanner getInfo = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int num_month_entered = getInfo.nextInt();
        String month ="";
        
        //Switch statement for months 1-12
        switch (num_month_entered) {
            case 1:  month = "January";
                break;
            case 2:  month = "February";
                break;
            case 3:  month = "March";
                break;
            case 4:  month = "April";
                break;
            case 5:  month = "May";
                break;
            case 6:  month = "June";
                break;
            case 7:  month = "July";
                break;
            case 8:  month = "August";
                break;
            case 9:  month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            }
        System.out.println("The name of the month is " +month+ ".");
    }
}