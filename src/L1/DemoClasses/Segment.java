package L1.DemoClasses;

import L1.Exceptions.GeometricException;

class Segment extends Figure {
    Point start;
    char startLetter;
    Point end;
    char endLetter;

    Segment(Point start, Point end, String Name) throws GeometricException {
        super();

        if (Name.isEmpty() || Name.length() != 2) {
            String exceptionMessage = "Segment name is empty or irregular! "
                                    + "Two characters is only allowed.";
            throw new GeometricException(exceptionMessage, Name, Name.length());
        }

        if (start.equals(end)) {
            String exceptionMessage = "Point with such name or coordinates "
                                    + "is already exists!";
            throw new GeometricException(exceptionMessage, end, String.valueOf(Name.charAt(1)));
        }

        this.start = start;
        this.end = end;
        this.startLetter = Name.charAt(0);
        this.endLetter = Name.charAt(1);
    }

    @Override
    double calculatePerimeter() throws GeometricException {
        String exceptionMessage = "Segment has no perimeter! But it has length, which is "
                                + this.start.findDistanceToAnotherPoint(this.end) + " :)";
        throw new GeometricException(exceptionMessage);
    }

    @Override
    double calculateArea() throws GeometricException {
        String exceptionMessage = "Segment has no area!";
        throw new GeometricException(exceptionMessage);
    }

    @Override
    public String getInformation() {
        return " " + startLetter + endLetter
                   + "[" + start.getInformation() + ";"
                         + end.getInformation() + "]";
    }
}