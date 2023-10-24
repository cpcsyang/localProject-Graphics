import java.awt.*;
public class Circle extends Shape {
    private int radius = 0;
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public static void add(Graphics g2, Circle c) {
        // oval's (x,y) is its upper-left while circle's (x,y) is the center.
        g2.fillOval(c.getX()-c.getRadius(), c.getY()-c.getRadius(), c.getRadius() * 2, c.getRadius() * 2);
    }
}
