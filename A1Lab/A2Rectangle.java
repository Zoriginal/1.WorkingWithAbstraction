package A1WorkingWithAbstraction.A1Lab;

public class A2Rectangle {
    private int xA;
    private int yA;
    private int xC;
    private int yC;


    public A2Rectangle (int xA, int yA, int xC, int yC) {
        this.xA = xA;
        this.yA = yA;
        this.xC = xC;
        this.yC = yC;
    }

    public boolean contains(A2Point point) {
        int pointX = point.getX();
        int pointY = point.getY();

        return pointX >= xA && pointY >= yA && pointX <= xC && pointY <= yC;
    }
}
