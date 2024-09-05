package chp07.lab1;

public class Square {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int area() {
        return (int)Math.pow(length, 2);
    }
}
