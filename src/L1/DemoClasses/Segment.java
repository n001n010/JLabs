package L1.DemoClasses;

import L1.Exceptions.*;

class Segment extends Figure{
    Point segmentStart;
    char segmentStartLetter;
    Point segmentEnd;
    char segmentEndLetter;
    
    Segment(Point start, Point end, String Name) throws GeometricException
    {
        super();
        
        if (Name.isEmpty() || Name.length()!=2){
            String exceptionMessage = "Segment name is empty or irregular! Two characters is only allowed.";
            throw new GeometricException(exceptionMessage, Name, Name.length());
        }
        
        if (start.equals(end)) {
            String exceptionMessage = "Point with such name or coordinates is already exists!";
            throw new GeometricException(exceptionMessage, end, String.valueOf(Name.charAt(1)));
        }

        this.segmentStart = start;
        this.segmentEnd = end;
        this.segmentStartLetter = Name.charAt(0);
        this.segmentEndLetter = Name.charAt(1);
    }

    @Override
    double calculatePerimeter() throws GeometricException {
        String exceptionMessage = "Segment has no perimeter! But it has length, which is "+
                                   segmentStart.findDistanceToAnotherPoint(segmentEnd)+" :)";
        throw new GeometricException(exceptionMessage);
    }

    @Override
    double calculateArea() throws GeometricException {
        String exceptionMessage = "Segment has no area!";
        throw new GeometricException(exceptionMessage);
    }

    @Override
    public String getInformation() {
        return " "+segmentStartLetter+segmentEndLetter+
               "["+segmentStart.getInformation()+";"+
                   segmentEnd.getInformation()+"]";
    }
}