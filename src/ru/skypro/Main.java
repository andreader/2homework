package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.5");
        final int MONTHNUMBER = 10,
                January = 1, February = 2, March = 3,
                April = 4, May = 5, June = 6,
                July = 7, August = 8, September = 9,
                October = 10, November = 11, December = 12;
        switch (MONTHNUMBER) {
            case December:
                System.out.println("It's winter, December!");
                break;
            case January:
                System.out.println("It's winter, January!");
                break;
            case February:
                System.out.println("It's winter, February!");
                break;
            case March:
                System.out.println("It's spring, March!");
                break;
            case April:
                System.out.println("It's spring, April!");
                break;
            case May:
                System.out.println("It's spring, May!");
                break;
            case June:
                System.out.println("It's summer, June!");
                break;
            case July:
                System.out.println("It's summer, July!");
                break;
            case August:
                System.out.println("It's summer, August!");
                break;
            case September:
                System.out.println("It's autumn, September!");
                break;
            case October:
                System.out.println("It's autumn, October!");
                break;
            case November:
                System.out.println("It's autumn, November!");
                break;
            default:
                System.out.println("Please, enter the correct month value 1-12!");
        }
        }
    }



