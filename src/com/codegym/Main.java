package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Find the number in the fibonacci range");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index in the fibonacci range:");

        int index = scanner.nextInt();

        int res = findValue(index);
        System.out.println("The value at position " + index + " in the fibonacci range is: " + res);
    }

    public static int findValue(int index) {

        if (index < 3) return 1;

        return findValue(index - 2) + findValue(index - 1);

    }
}
