package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.2");
        int clientDeviceYear = 2015;
        int OS = 0;
        boolean oldIOS = clientDeviceYear < 2015 && OS == 0;
        boolean oldAndroid = clientDeviceYear < 2015 && OS == 1;
        if (oldIOS) {
            System.out.println("Install the light version of the app for IOS. Here is the link..");
        } else if (OS == 0) {
            System.out.println("Install the app for IOS. Here is the link..");
        }
        if (oldAndroid) {
            System.out.println("Install the light version of the app for Android. Here is the link..");
        } else if (OS == 1) {
            System.out.println("Install the app for Android. Here is the link..");
        }
    }
}

