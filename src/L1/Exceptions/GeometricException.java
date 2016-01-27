package L1.Exceptions;

import L1.DemoClasses.*;

public class GeometricException extends Exception {
    private Point badPoint;
    private String badName;
    private Figure badFigure;

    public GeometricException(String addFigureEx, Figure badFigure, String badName) {
        super(addFigureEx);
        this.badFigure = badFigure; //idea gittest
        this.badName = badName;
    }

    public GeometricException(String addPointEx, Point badPoint, String badName) {
        super(addPointEx);
        this.badPoint = badPoint;
        this.badName = badName;
    }

    public GeometricException(String calculationEx) {
        super(calculationEx);
    }

    public GeometricException(String segmentNameLengthEx, String transferredName, Integer length) {
        super(segmentNameLengthEx + ": " + transferredName + " length is " + length.toString());
    }

    public void getWrongParameters() {
        System.err.println(this.badName + this.badPoint.getInformation());
    }
}