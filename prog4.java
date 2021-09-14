/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter a verb: ");
        String verb = b.nextLine();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter an adjective: ");
        String adjective = c.nextLine();
        Scanner d = new Scanner(System.in);
        System.out.println("Enter an adverb: ");
        String adverb = d.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
