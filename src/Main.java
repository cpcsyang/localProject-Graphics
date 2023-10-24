import java.awt.*;          // for graphics

public class Main {
    public static void main(String[] args) {
        run();
        System.out.println("finished.");
    }

    public static void run() {
        Canvas.setCanvasSize(250,350);

        int width = Canvas.getCanvasWidth();
        int height = Canvas.getCanvasHeight();
        System.out.println("Canvas size: " + width + ", " + height);

        Circle circ = new Circle(50);
        circ.setPosition(150, 200);
        circ.setColor(Color.blue);
        Canvas.add(circ);

        Rectangle rect = new Rectangle(100, 30);
        rect.setPosition(100, 250);
        rect.setColor(Color.red);
        Canvas.add(rect);

        Text txt = new Text("Hello World!", "30pt Arial");
        txt.setPosition(150, 200);
        txt.setColor(Color.black);
        Canvas.add(txt);


    }
}