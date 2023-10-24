import java.awt.*;

public class Rectangle extends Shape {
    private int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public static void add(Graphics g2, Rectangle r) {
        g2.fillRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }
}
