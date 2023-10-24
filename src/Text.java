import java.awt.*;

public class Text extends Shape {
    private String label = "";
//    private String font = "Arial";
    private int fontSize = 20;
    private String fontFamily = "Arial";

    public Text (String label) {
        this(label, "20pt, Arial");
    }
    public Text (String label, String font) {
        this.label = label;
//        this.font = font;
        fontSize = Integer.parseInt(font.substring(0, font.indexOf("pt")));
        fontFamily = font.substring(font.indexOf("pt ") + 3);
        System.out.println("font size: " + fontSize + ", " + fontFamily);
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public String getText() {
        return label;
    }

    public void setText(String label) {
        this.label = label;
    }

    public static void add(Graphics g2, Text t) {
        g2.setFont (new Font(t.getFontFamily(), Font.PLAIN, t.getFontSize()));
        g2.drawString(t.getText(), t.getX(), t.getY());
    }
}
