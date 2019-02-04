package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Scanner colorFile = new Scanner(new File("colors.txt"));
        int maxIndx = -1;
        String array [] = new String[150];
        String text[];
        String color[] = new String[150];
        String hex[] = new String[150];
        System.out.println("This is a or converter. Please pick one of the following to convert:\n\t- RGB\n\t\tEx: 255, 65, 4\n\t- Hex\n\t\tEx: f23ab2\n\t- Color\n\t\tEx: BurlyWood");

        String type = sc.nextLine();
        System.out.println("What value would you like to convert?");
        String value = sc.nextLine();

        while (colorFile.hasNext()) {
            maxIndx++;
            array[maxIndx] = colorFile.nextLine();
        }
        colorFile.close();

        for(int i = 1; i <= maxIndx; i++) {
            text = array[i].split("\t");
            color[i] = text[0];
            hex[i] = text[1];
        }

        if((type.toLowerCase()).equals("rgb")) {

        } else if((type.toLowerCase()).equals("hex")) {

            for(int j = 0; j < hex.length; j++) {
                if(value.equals(hex[j])) {
                    System.out.println(color[j]);
                }
            }

        } else if((type.toLowerCase()).equals("color")) {

            for(int j = 0; j < color.length; j++) {
                if(value.equals(color[j])) {
                    System.out.println(hex[j]);
                }
            }

        } else {

            System.out.println("That is not one of the options.");
            
        }

    }
}
