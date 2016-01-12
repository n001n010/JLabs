package L1.DemoClasses;

import static java.lang.Math.*;

public class Circle extends Figure {

    private final Point circumcentre;
    private final double radius;

    public Circle(Point circumcentre, double radius) {
        super();
        this.circumcentre = circumcentre;
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return this.radius * 2 * PI;
    }

    @Override
    double calculateArea() {
        return pow(this.radius, 2) * PI;
    }

    @Override
    public String getInformation() {
        return " which centre is " + this.circumcentre + 
               ", radius is " + this.radius;
    }
}