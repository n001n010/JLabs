package L1.MainPackage;

import static java.lang.Math.*;

class Circle extends Figure {
    private final Point circumcentre;
    private final double circleRadius;
    
    Circle (Point centre, double radius)
    {
        super();
        this.circumcentre = centre;
        this.circleRadius = radius;
    }

    @Override
    double calculatePerimeter()
    {
        return this.circleRadius * 2 * PI;
    }
    
    @Override
    double calculateArea()
    {
        return pow(this.circleRadius, 2) * PI;
    }
    
    @Override
    public String getInformation()
    {
        return " which centre is "+this.circumcentre +", radius is "+ this.circleRadius;
    }
}