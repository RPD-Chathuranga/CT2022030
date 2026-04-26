package Q2;

import java.util.Scanner;
import javax.swing.JFrame;

public class Q2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            
            JFrame frame = new JFrame(firstName + " " + lastName);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}