interface Colorable {
    void setColor(String color);
    String getColor();
}

class Pen implements Colorable {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        Pen redPen = new Pen();
        redPen.setColor("Red");
        System.out.println(redPen.getColor());
    }
}
