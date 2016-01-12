package L1.Factories;

import L1.DemoClasses.*;
import L1.Exceptions.GeometricException;

public class RandomFigureGenerator {
    private Circle CreateCircle() {
        return new Circle(new Point(0,0),2);
    }

    private Polygon CreateTriangle() {
        Polygon triangle = new Polygon();
        try {
            triangle.addElement(new Point(-1,0),"A");
            triangle.addElement(new Point(0,1),"B");
            triangle.addElement(new Point(1,0),"C");
        } catch (GeometricException e) {
            e.printStackTrace();
        }
        return triangle;
    }

    private Polygon CreateSquare() {
        Polygon square = new Polygon();
        try {
            square.addElement(new Point(-1,1),"A");
            square.addElement(new Point(0,1),"B");
            square.addElement(new Point(1,0),"C");
            square.addElement(new Point(1,-1),"D");
        } catch (GeometricException e) {
            e.printStackTrace();
        }
        return square;
    }

    public Figure GenerateRandomFigure() {
        double z = Math.random();
        if (z < 0.33) return CreateCircle();
        if (z > 0.66) return CreateTriangle();
                 else return CreateSquare();
    }
}