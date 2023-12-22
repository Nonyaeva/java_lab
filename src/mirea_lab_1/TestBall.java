package mirea_lab_1;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Yellow", 1, 3);
        Ball b2 = new Ball("Blue", 4,2);
        Ball b3 = new Ball("Green", 6, 10);
        b1.setRadius(2);
        System.out.println(b1);
        b1.ballCravity();
        System.out.println();
        b2.ballCravity();
        System.out.println();
        b3.ballCravity();
    }
}
