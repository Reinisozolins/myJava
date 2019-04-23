package GetterSetter;

public class Pencil {
    private String color;
    private int length;

    public Pencil() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLenght() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



    @Override
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
