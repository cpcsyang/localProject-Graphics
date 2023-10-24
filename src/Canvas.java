import java.awt.*;
import java.util.ArrayList;

/**
 * Author: Frank Yang
 * <p>(c) 2023.10.23
 * <p>
 * This Canvas.java class is written so students can learn Java objects using basic graphics elements.
 * The graphics elements are Circle, Rectangle and Text.
 **/
public class Canvas extends DrawingPanel {
    private static final Canvas panel = new Canvas();
    private static final Graphics g2 = panel.getGraphics();
    private static ArrayList<Shape> shapes = new ArrayList<Shape>();

    public static void add(Shape obj) {
        Canvas.shapes.add(obj);

        g2.setColor(obj.getColor());
        if (obj instanceof Circle) {
            Circle.add(g2, (Circle) obj);
        }
        if (obj instanceof Rectangle) {
            Rectangle.add(g2, (Rectangle) obj);
        }
        if (obj instanceof Text) {
            Text.add(g2, (Text) obj);
        }
    }
    public static int getNumShapes() {
        return shapes.size();
    }

    public static void setCanvasSize(int width, int height) {
        panel.setSize(width, height);
    }

    public static void setCanvasWidth(int width) { setCanvasSize(width, panel.getHeight()); }

    public static void setCanvasHeight(int height) { panel.setSize(panel.getWidth(), height); }

    public static int getCanvasWidth() { return panel.getWidth(); }

    public static int getCanvasHeight() { return panel.getHeight(); }

}
