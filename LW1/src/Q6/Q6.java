package Q6;

import java.util.Scanner;
import javax.swing.JFrame;

public class Q6 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter width: ");
            int width = sc.nextInt();

            System.out.print("Enter height: ");
            int height = sc.nextInt();
            sc.nextLine(); // IMPORTANT (fix input issue)

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            JFrame frame = new JFrame(title);
            frame.setSize(width, height);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        }
    }
}