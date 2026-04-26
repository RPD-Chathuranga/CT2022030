package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter sentence: ");
            String input = sc.nextLine();

            String[] parts = input.split("!");

            System.out.println(parts[0].trim());
            System.out.println(parts[1].trim());
        }
    }
}