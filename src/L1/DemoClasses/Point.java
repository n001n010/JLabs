package L1.DemoClasses;

import L1.Interfaces.DebugOutputStream;

public class Point implements DebugOutputStream {

    final double x;
    final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double involuteTheDifferenceOfTwoNumbers(double a, double b) {
        return Math.pow(a - b, 2);
    }

    public double findDistanceToAnotherPoint(Point another) {
        return Math.sqrt(involuteTheDifferenceOfTwoNumbers(another.x, this.x)
                       + involuteTheDifferenceOfTwoNumbers(another.y, this.y));
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Point) {
            Point another = (Point) anObject;
            return this.x == another.x && this.y == another.y;
        }
        return false;
    }

    @Override
    public String getInformation() {
        return "(" + this.x + ";" + this.y + ")";
    }

    @Override
    public String knowMyself() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.knowMyself() + " " + this.getInformation();
    }
}