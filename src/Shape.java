import java.awt.*;

abstract class Shape {
    private int x, y;
    private Color color = Color.black;
    public int getX() { return x; }
    public int getY() { return y; }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(Color color) { this.color = color; }

    public Color getColor() { return color; }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    abstract void add(Graphics g, Shape s);
}
