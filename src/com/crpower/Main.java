package com.crpower;

import java.util.Scanner;

public class Main {
    static void switchTest(String season) {
        switch (season) {
//            Spring , summer autumn and winter,
            case "spring":
                System.out.println("it's spring");
                break;
            case "summer":
                System.out.println("it's summer");
                break;
            case "autumn":
                System.out.println("it's autumn");
                break;
            case "winter":
                System.out.println("it's winter");
                break;
            default:
                System.out.println("out of year season");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a season in a year : ");
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine().toLowerCase();
        switchTest(season);
    }

}

