package com.ukol3;

import java.util.Scanner;


public class Main {
    static boolean skip = false;

    public static void main(String[] args) {
        StringBuffer sbuffer = null;

        System.out.println("Zadejte 4 telefonní čísla ve formátu: XXX XXX XXX k XXX XXX XXX k XXX XXX XXX k XXX XXX XXX");
        sbuffer = new StringBuffer();
        Scanner input = new Scanner(System.in);
        sbuffer.append(input.nextLine());
        String str = sbuffer.toString();
        String[] arrOfStr = str.split(" k ");

        //První číslo z arraye
        if (arrOfStr[0].matches("[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}")) {
            System.out.println("První číslo je naformátováno správně");
            System.out.println("První číslo je" + "   +420 " + arrOfStr[0]);
            if (arrOfStr[0].isBlank())
                    skip = true;
        } else {
            System.out.println("První číslo bylo zadáno špatně");
        }

        //Druhé číslo z arraye
        skip = false;
        if (arrOfStr[1].matches("[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}")) {
            System.out.println("Druhé číslo je naformátováno správně");
            System.out.println("Druhé číslo je" + "   +420 " + arrOfStr[1]);
            if (arrOfStr[1].isBlank())
                skip = true;
        } else {
            System.out.println("Druhé číslo bylo zadáno špatně");
        }

        //Třetí číslo
        skip = false;
        if (arrOfStr[2].matches("[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}")) {
            System.out.println("Třetí číslo je naformátováno správně");
            System.out.println("Třetí číslo je" + "   +420 " + arrOfStr[2]);
            if (arrOfStr[2].isBlank())
                skip = true;
        } else {
            System.out.println("Třetí číslo bylo zadáno špatně");
        }

        //Čtvrté číslo
        skip = false;
        if (arrOfStr[3].matches("[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}")) {
            System.out.println("Čtvrté číslo je naformátováno správně");
            System.out.println("Čtvrté číslo je" + "   +420 " + arrOfStr[3]);
            if (arrOfStr[3].isBlank())
                skip = true;
        } else {
            System.out.println("Čtvrté číslo bylo zadáno špatně");
        }
    }
}