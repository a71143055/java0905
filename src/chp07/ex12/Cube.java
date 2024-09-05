package chp07.ex12;

public class Cube {
    int length;

    int volume() {
        return (int)Math.pow(length, 3);
    }

    int area() {
        return 6 * (int)Math.pow(length, 2);
    }

    public static void main(String[] args) {
        Cube c = new Cube();
        c.length = 5;
        System.out.printf("한 변의 길이가 %d인\n",c.length);
        System.out.printf("\t정육면체의 부피: %.2f\n",(float)c.volume());
        System.out.printf("\t정육면체의 겉넓이: %.2f\n",(float)c.area());
    }
}