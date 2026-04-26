package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first name: ");
            String first = sc.nextLine();

            System.out.print("Enter middle name: ");
            String middle = sc.nextLine();

            System.out.print("Enter last name: ");
            String last = sc.nextLine();

            System.out.println(first + " " + middle.charAt(0) + ". " + last);
        }
    }
}