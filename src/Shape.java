import java.awt.*;

public class Shape {
    private int x = 0, y = 0;
    private Color color = Color.black;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
