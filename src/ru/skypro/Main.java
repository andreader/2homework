package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.3");
        int year = 4;
        year = year+4;
        boolean leap = year == 400&&year!=100;
        if (leap) {
            System.out.println("This year is leap");
        }else if (year == 3) {
            System.out.println("This year is not leap");
        }
    }
}

