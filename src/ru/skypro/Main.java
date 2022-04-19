package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.3");
        int year = 4400;
        boolean NotLeapYear = year%100 == 0 && year%400 != 0;
        boolean LeapYear = year%4 == 0;
        if (NotLeapYear) {
            System.out.println("The year is not leap");
        } else if (LeapYear) {
            System.out.println("The year is leap");
        }else {
            System.out.println("The year is not leap");
        }
        }
    }


