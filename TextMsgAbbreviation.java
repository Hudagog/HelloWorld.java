package Hellow;

import java.util.Scanner;

public class TextMsgAbbreviation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
        System.out.println("Input an abbreviation:");
        String str = scnr.nextLine();
        if (str.equals("LOL")) {
            System.out.println("laughing out loud");
        } else if (str.equals("IDK")) {
            System.out.println("I don't know");
        } else if (str.equals("BFF")) {
            System.out.println("best friends forever");
        } else if (str.equals("IMHO")) {
            System.out.println("in my humble opinion");
        } else if (str.equals("TMI")) {
            System.out.println("too much information");
        } else {
            System.out.println("Unknown");
        }
    }
}
