package Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first name: ");
            String first = sc.next();

            System.out.print("Enter middle name: ");
            String middle = sc.next();

            System.out.print("Enter last name: ");
            String last = sc.next();

            System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
        }
    }
}