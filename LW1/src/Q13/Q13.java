package Q13;

import javax.swing.JFrame;

public class Q13 {
    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Blinking Frame");

        frame.setSize(300, 200);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        Thread.sleep(1000);

        frame.setVisible(false);
        Thread.sleep(1000);

        frame.setVisible(true);
    }
}