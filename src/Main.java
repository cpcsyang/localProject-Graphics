import java.util.Scanner;   // for user Scanner such as user input
import java.awt.*;          // for graphics

public class Main {
    private static DrawingPanel panel = new DrawingPanel();
    private static Graphics2D g2 = panel.getGraphics();
    public static void main(String[] args) {
        run();
    }

    public static void add(Shape obj) {

    }

    public static void run() {

        g2.drawLine(25, 75, 175, 25);
        g2.setColor(Color.cyan);
        g2.fillOval(100, 100, 150, 200);
        g2.setColor(Color.black);
        g2.drawOval(100, 100, 150, 200);
        g2.setColor(Color.red);
        g2.fillRect(250, 300, 200, 50);

        Circle circ = new Circle(50);
        circ.setPosition(150, 170);
        System.out.println(circ.getX() + ", " + circ.getY());

    }
}