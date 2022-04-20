package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.4");
        int deliveryDistance = 95;
        boolean zone1 = (deliveryDistance < 20);
        boolean zone2 = (deliveryDistance >= 20 && deliveryDistance < 60);
        boolean zone3 = (deliveryDistance >= 60 && deliveryDistance < 100);
        if (zone1) {
            System.out.println("It takes 1 day" + " (delivery time)");
        }
        if (zone2) {
            System.out.println("It takes 2 days" + " (delivery time)");
        }
        if (zone3) {
            System.out.println("It takes 3 days" + " (delivery time)");
        }
    }
}


